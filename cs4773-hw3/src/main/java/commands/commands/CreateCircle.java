package commands.commands;

import commands.commandManager.State;
import commands.shapes.Circle;

public class CreateCircle {

    public void execute(double radius) {
        Circle newCircle = new Circle(radius);
        State.existingShapes.add(newCircle);
    }
}
