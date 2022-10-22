package commands.handlers;

import commands.commandManager.State;

public interface Handler {
    Handler nextHandler = null;

    public void request(String command, State state);
}
