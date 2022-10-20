package commands.commands;

import commands.shapes.Shape;
import commands.commandManager.State;

public class Delete extends Command {

    public void execute(Shape shape) {
        State.existingShapes.remove(shape);
    }

    public void undo() {

    }
}
