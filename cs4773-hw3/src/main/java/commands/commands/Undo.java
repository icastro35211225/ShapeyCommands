package commands.commands;

import commands.commandManager.State;

public class Undo implements Command {

    public void execute(String[] command, State state) {
        Command undoCommand = state.popMomento().getCommand();
        if (undoCommand != null) {
            undoCommand.undo(state);
        } else {
            System.out.println("No commands to undo");
        }
    }

    public void undo(State state) {

    }
}
