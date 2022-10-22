package commands.commands;

import commands.commandManager.State;
import commands.shapes.Rectangle;

public class CreateRectangle implements Command {
    String[] commandString;

    public void execute(String[] command, State state) {
        commandString = command;
        double height = Double.parseDouble(command[2]);
        double width = Double.parseDouble(command[3]);
        Rectangle newRectangle = new Rectangle(height, width);
        state.existingShapes.add(newRectangle);
    }

    public void undo(String[] command, State state) {
        Command oldCommand = state.popMomento().getCommand();
        String[] oldCommandString = oldCommand.getCommandString();

        double height = Double.parseDouble(oldCommandString[2]);
        double width = Double.parseDouble(oldCommandString[3]);

        Rectangle rectangle = new Rectangle(height, width);
        int index = state.getShapeIndex(rectangle);

        state.removeShape(index);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
