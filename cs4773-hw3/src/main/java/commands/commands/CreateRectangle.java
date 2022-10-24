package commands.commands;

import commands.commandManager.State;
import commands.shapes.Rectangle;

public class CreateRectangle implements Command {
    Rectangle newRectangle;

    public void execute(String[] command, State state) {
        int width = Integer.parseInt(command[2]);
        int height = Integer.parseInt(command[3]);
        newRectangle = new Rectangle(height, width);
        state.existingShapes.add(newRectangle);
    }

    public void undo(State state) {
        state.removeShape(newRectangle);
    }
}
