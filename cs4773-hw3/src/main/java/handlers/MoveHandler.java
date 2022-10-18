package handlers;

import commands.commands.Move;
import commands.shapes.Shape;

public class MoveHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("MOVE")) {
            nextHandler.request(command, shape);
        }

        try {
            double[] coordinates = { Double.parseDouble(splitCommand[1]),
                    Double.parseDouble(splitCommand[2]) };

            Move.execute(shape, coordinates);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
