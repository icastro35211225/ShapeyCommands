package commands.commands;

import commands.commandManager.State;
import commands.shapes.Origin;
import commands.shapes.Shape;

public class Move implements Command {
    String[] commandString;
    Origin prevOrigin;
    int index;

    public void execute(String[] command, State state) {
        commandString = command;
        double x = Double.parseDouble(command[1]);
        double y = Double.parseDouble(command[2]);
        Shape shape = state.existingShapes.get(state.currentShape);
        Origin newOrigin = new Origin(x, y);
        shape.setOrigin(newOrigin);
        prevOrigin = newOrigin;
    }

    public void undo(String[] command, State state) {
        state.getExistingShapes().get(index).setOrigin(prevOrigin);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
