package handlers;

import commands.commands.Draw;
import commands.shapes.Shape;

public class DrawHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("DRAW")) {
            nextHandler.request(command, shape);
        }

        Draw draw = new Draw();
        draw.excecute(shape);
    }
}
