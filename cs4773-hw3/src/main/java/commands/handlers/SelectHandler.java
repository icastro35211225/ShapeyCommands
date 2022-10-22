package commands.handlers;

import commands.commandManager.State;
import commands.commands.Select;

public class SelectHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("SELECT")) {
            nextHandler.request(command, state);
        }

        try {
            Integer.parseInt(splitCommand[1]);
        } catch (Exception e) {
            System.err.println(e);
        }

        Select select = new Select();

        select.execute(splitCommand, state);
        state.addCommand(select);
    }
}
