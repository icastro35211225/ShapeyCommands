package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle implements Command {
    String[] commandString;

    public void execute(String[] command, State state) {
        commandString = command;
        double radius = Double.parseDouble(command[2]);
        Circle newCircle = new Circle(radius);
        state.existingShapes.add(newCircle);
    }

    public void undo(String[] command, State state) {
        Command oldCommand = state.popMomento().getCommand();

        String[] oldCommandString = oldCommand.getCommandString();
        double radius = Double.parseDouble(oldCommandString[2]);
        Circle circle = new Circle(radius);

        int index = state.getShapeIndex(circle);

        if (index != -1) {
            state.removeShape(index);
        }
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
