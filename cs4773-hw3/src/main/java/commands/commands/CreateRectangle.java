package commands.commands;

import commands.commandManager.State;
import commands.shapes.Rectangle;

public class CreateRectangle implements Command {

    public void execute(String[] command, State state) {
        double height = Double.parseDouble(command[2]);
        double width = Double.parseDouble(command[3]);
        Rectangle newRectangle = new Rectangle(height, width);
        state.existingShapes.add(newRectangle);
    }

    public void undo(String[] command, State state) {

    }
}
