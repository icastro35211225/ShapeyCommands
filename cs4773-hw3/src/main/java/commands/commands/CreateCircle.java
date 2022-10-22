package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle implements Command {

    public void execute(String[] command, State state) {
        double radius = Double.parseDouble(command[2]);
        Circle newCircle = new Circle(radius);
        state.existingShapes.add(newCircle);
    }

    public void undo(String[] command, State state) {

    }
}
