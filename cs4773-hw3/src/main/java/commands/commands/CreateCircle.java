package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle extends Command {

    public void execute(double radius) {
        Circle newCircle = new Circle(radius);
        State.existingShapes.add(newCircle);
    }

    public void undo() {

    }
}
