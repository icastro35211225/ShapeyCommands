package commands.commands;

import commands.commandManager.State;
import commands.shapes.Color;

public class ChangeColor implements Command {
    String[] commandString;
    Color prevColor;

    public void execute(String[] command, State state) {
        prevColor = state.getShape().getColor();
        this.commandString = command;
        Color color = Color.valueOf(command[1]);
        state.getShape().setColor(color);
    }

    public void undo(String[] command, State state) {
        state.getShape().setColor(prevColor);
    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
