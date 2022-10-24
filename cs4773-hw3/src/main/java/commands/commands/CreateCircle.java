package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle implements Command {
    Circle newCircle;

    public void execute(String[] command, State state) {
        int radius = Integer.parseInt(command[2]);
        newCircle = new Circle(radius);
        state.existingShapes.add(newCircle);
    }

    public void undo(State state) {
        state.removeShape(newCircle);
    }
}
