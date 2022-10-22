package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class ChangeColor implements Command {

    public void execute(String[] command, State state) {
        String color = command[1];
        Shape currentShape = state.getShape();
        currentShape.setColor(color);
    }

    public void undo(String[] command, State state) {

    }
}
