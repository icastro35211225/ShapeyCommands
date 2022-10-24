package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Delete implements Command {
    Shape deletedShape;
    int prevIndex;

    public void execute(String[] command, State state) {
        prevIndex = state.getCurrentShape();
        deletedShape = state.getShape();
        state.removeShape(state.currentShape);
        state.setCurrentShape(-1);
    }

    public void undo(State state) {
        state.addShape(prevIndex, deletedShape);
    }
}
