package handlers;

import commands.commandManager.State;
import commands.commands.DrawScene;
import commands.shapes.Shape;

public class DrawSceneHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("DRAWSCENE")) {
            nextHandler.request(command, shape);
        }

        DrawScene drawScene = new DrawScene();
        drawScene.execute(State.getExistingShapes());
    }
}