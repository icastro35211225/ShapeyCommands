package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class ChangeColor implements Command {
    String[] commandString;

    public void execute(String[] command, State state) {
        this.commandString = command;
        String color = command[1];
        Shape currentShape = state.getShape();
        currentShape.setColor(color);
    }

    public void undo(String[] command, State state) {
        Command oldCommand = state.popMomento().getCommand();

        String[] oldCommandString = oldCommand.getCommandString();

    }

    public String[] getCommandString() {
        return this.commandString;
    }
}
