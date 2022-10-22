package commands.handlers;

import commands.commandManager.State;
import commands.commands.ChangeColor;

public class ColorHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(command);
        if (!splitCommand[0].equals("COLOR")) {
            nextHandler.request(command, state);
        }

        ChangeColor changeColor = new ChangeColor();

        changeColor.execute(splitCommand, state);
        state.addCommand(changeColor);
    }
}
