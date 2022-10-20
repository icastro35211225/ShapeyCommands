package commands.commands;

import commands.commandManager.State;
import commands.shapes.Rectangle;

public class CreateRectangle extends Command {

    public void execute(int height, int width) {
        Rectangle newRectangle = new Rectangle(height, width);
        State.existingShapes.add(newRectangle);
    }

    public void undo() {

    }
}
