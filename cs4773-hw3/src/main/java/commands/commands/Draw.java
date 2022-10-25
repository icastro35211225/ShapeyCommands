package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Draw implements Command {

    public void execute(String[] command, State state) {
        int currentIndex = state.currentShape;
        if (currentIndex != -1 && currentIndex < state.getShapes().size()) {
            Shape currentShape = state.existingShapes.get(state.currentShape);
            System.out.println(currentShape.draw());
        } else {
            System.out.println("no shape selected");
        }
    }

    public void undo(State state) {

    }
}
