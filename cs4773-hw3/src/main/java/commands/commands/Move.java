package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Move implements Command {
    String[] commandString;

    public void execute(String[] command, State state) {
        commandString = command;
        double x = Double.parseDouble(command[1]);
        double y = Double.parseDouble(command[2]);
        double[] coordinates = { x, y };
        Shape shape = state.existingShapes.get(state.currentShape);

        shape.setOrigin(coordinates);
    }

    public void undo(String[] command, State state) {
        // I store the command string, so I can try to use that so I
        // don't pass anything

    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
