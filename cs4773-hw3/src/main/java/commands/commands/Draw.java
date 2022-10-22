package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Draw implements Command {

    public void execute(String[] command, State state) {
        Shape currentShape = state.existingShapes.get(state.currentShape);
        System.out.println(currentShape.draw());
    }

    public void undo(String[] command, State state) {

    }
}
