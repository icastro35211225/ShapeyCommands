package commands.commands;

import commands.commandManager.State;
import commands.shapes.Origin;

public class Move implements Command {
    Origin prevOrigin;
    int prevIndex;

    public void execute(String[] command, State state) {
        double x = Double.parseDouble(command[1]);
        double y = Double.parseDouble(command[2]);
        Origin newOrigin = new Origin(x, y);

        prevIndex = state.currentShape;
        prevOrigin = state.getShape().getOrigin();

        state.existingShapes.get(state.currentShape).setOrigin(newOrigin);
    }

    public void undo(State state) {
        state.getExistingShapes().get(prevIndex).setOrigin(prevOrigin);
    }
}
