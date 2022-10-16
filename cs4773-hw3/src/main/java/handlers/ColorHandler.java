package handlers;

import commands.shapes.Shape;

public class ColorHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(command);
        if (!splitCommand[0].equals("COLOR")) {
            nextHandler.request(command, shape);
        }
    }
}
