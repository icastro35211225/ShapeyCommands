package commands.commandManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import commands.handlers.ColorHandler;
import commands.handlers.CreateHandler;
import commands.handlers.DrawHandler;
import commands.handlers.DrawSceneHandler;
import commands.handlers.MoveHandler;
import commands.handlers.SelectHandler;
import commands.handlers.UndoHandler;

public class Main {

    public void main(String[] args) {
        initHandlers();

        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null) {

        }
    }

    public static void initHandlers() {
        CreateHandler createHandler = new CreateHandler();
        ColorHandler colorHandler = new ColorHandler();
        DrawHandler drawHandler = new DrawHandler();
        DrawSceneHandler drawSceneHandler = new DrawSceneHandler();
        MoveHandler moveHandler = new MoveHandler();
        SelectHandler selectHandler = new SelectHandler();
        UndoHandler undoHandler = new UndoHandler();

        createHandler.setNextHandler(colorHandler);
        colorHandler.setNextHandler(drawHandler);
        drawHandler.setNextHandler(drawSceneHandler);
        drawSceneHandler.setNextHandler(moveHandler);
        moveHandler.setNextHandler(selectHandler);
        undoHandler.setNextHandler(null);
    }
}