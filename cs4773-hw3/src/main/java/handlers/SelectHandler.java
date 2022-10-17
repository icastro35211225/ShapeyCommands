package handlers;

import commands.shapes.Shape;

public class SelectHandler implements Handler {

    public void setNextHandler(Handler nextHanlder) {

    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("SELECT")) {
            nextHandler.request(command, shape);
        }

    }
}
