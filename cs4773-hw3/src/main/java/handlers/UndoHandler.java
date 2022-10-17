package handlers;

import commands.shapes.Shape;

public class UndoHandler implements Handler {

    public void setNextHandler(Handler nextHanlder) {

    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("UNDO")) {
            nextHandler.request(command, shape);
        }
    }
}
