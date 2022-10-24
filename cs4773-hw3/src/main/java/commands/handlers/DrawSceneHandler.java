package commands.handlers;

import commands.commandManager.State;
import commands.commands.DrawScene;

public class DrawSceneHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("DRAWSCENE")) {
            nextHandler.request(command, state);
        } else {

            DrawScene drawScene = new DrawScene();

            drawScene.execute(splitCommand, state);
            state.addCommand(drawScene);
        }
    }
}