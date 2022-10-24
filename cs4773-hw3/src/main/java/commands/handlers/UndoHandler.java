package commands.handlers;

import commands.commandManager.State;
import commands.commands.Undo;

public class UndoHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("UNDO")) {
            System.err.println("ERROR! Invalid Command Given!! -_-");
        } else {
            Undo undo = new Undo();
            undo.execute(splitCommand, state);
        }
    }
}
