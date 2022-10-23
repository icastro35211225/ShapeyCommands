package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle implements Command {
    String[] commandString;
    Circle newCircle;

    public void execute(String[] command, State state) {
        commandString = command;
        double radius = Double.parseDouble(command[2]);
        newCircle = new Circle(radius);
        state.existingShapes.add(newCircle);
    }

    public void undo(String[] command, State state) {
        state.getExistingShapes().remove(newCircle);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
