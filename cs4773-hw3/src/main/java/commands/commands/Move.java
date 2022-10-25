package commands.commands;

import commands.commandManager.State;
import commands.shapes.Origin;

public class Move implements Command {
    Origin prevOrigin;
    int prevIndex;

    public void execute(String[] command, State state) {
        int x = Integer.parseInt(command[1]);
        int y = Integer.parseInt(command[2]);
        Origin newOrigin = new Origin(x, y);

        prevIndex = state.currentShape;
        prevOrigin = state.getShape().getOrigin();

        state.setOrigin(newOrigin);
    }

    public void undo(State state) {
        state.getShapes().get(prevIndex).setOrigin(prevOrigin);
    }
}
