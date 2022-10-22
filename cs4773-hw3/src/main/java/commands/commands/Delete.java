package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Delete implements Command {
    String[] commandString;
    Shape deletedShape = null;
    int index;

    public void execute(String[] command, State state) {
        commandString = command;
        index = state.currentShape;
        deletedShape = state.getShape();
        state.existingShapes.remove(state.currentShape);
    }

    public void undo(String[] command, State state) {
        state.existingShapes.add(index, deletedShape);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
