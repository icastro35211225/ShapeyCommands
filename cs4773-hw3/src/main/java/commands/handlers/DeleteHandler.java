package commands.handlers;

import commands.commandManager.State;
import commands.commands.Delete;

public class DeleteHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommad = command.split(" ");

        if (!splitCommad[0].equals("DELETE")) {
            nextHandler.request(command, state);
        }

        Delete delete = new Delete();

        delete.execute(splitCommad, state);
        state.addCommand(delete);
    }
}
