package handlers;

import commands.shapes.Shape;

public class SelectHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommad = command.split(" ");

        if (!splitCommad[0].equals("DELETE")) {
            nextHandler.request(command, shape);
        }
    }
}
