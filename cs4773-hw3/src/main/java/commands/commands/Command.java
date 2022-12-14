package commands.commands;

import commands.commandManager.State;

public interface Command {

    void execute(String[] command, State state);

    void undo(State state);
}
