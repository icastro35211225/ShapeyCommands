package commands.commands;

import commands.commandManager.State;
import commands.shapes.Rectangle;

public class CreateRectangle implements Command {
    String[] commandString;
    Rectangle newRectangle;

    public void execute(String[] command, State state) {
        commandString = command;
        double height = Double.parseDouble(command[2]);
        double width = Double.parseDouble(command[3]);
        newRectangle = new Rectangle(height, width);
        state.existingShapes.add(newRectangle);
    }

    public void undo(String[] command, State state) {
        state.getExistingShapes().remove(newRectangle);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
