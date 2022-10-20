package handlers;

import commands.commandManager.State;
import commands.commands.Select;
import commands.shapes.Shape;

public class SelectHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("SELECT")) {
            nextHandler.request(command, shape);
        }

        try {
            int index = Integer.parseInt(splitCommand[1]);
            if (State.existingShapes.get(index) != null) {
                Select.execute(index);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
