package commands.handlers;

import commands.commandManager.State;
import commands.commands.Command;

public class UndoHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("UNDO")) {
            // nextHandler.request(command, state);
            System.err.println("ERROR! Invalid Command Given!! -_-");
        }

        Command undoCommand = state.popCommand().getCommand();
        undoCommand.undo(splitCommand, state);
    }
}
