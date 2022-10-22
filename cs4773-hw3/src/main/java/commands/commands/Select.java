package commands.commands;

import commands.commandManager.State;

public class Select implements Command {
    int selectedShape = 0;
    int prevShape = 0;

    public void execute(String[] command, State state) {
        int index = Integer.parseInt(command[1]);

        prevShape = selectedShape;
        selectedShape = index;

        state.currentShape = index;
    }

    public void undo(String[] command, State state) {

    }
}
