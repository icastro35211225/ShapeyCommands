package commands.commands;

import commands.commandManager.State;
import commands.shapes.Color;

public class ChangeColor implements Command {
    Color prevColor;

    public void execute(String[] command, State state) {
        prevColor = state.getShape().getColor();
        Color color = Color.valueOf(command[1]);
        state.getShape().setColor(color);
    }

    public void undo(State state) {
        state.getShape().setColor(prevColor);
    }
}
