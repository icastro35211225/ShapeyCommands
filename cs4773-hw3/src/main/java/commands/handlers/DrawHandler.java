package commands.handlers;

import commands.commandManager.State;
import commands.commands.Draw;

public class DrawHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("DRAW")) {
            nextHandler.request(command, state);
        } else {

            Draw draw = new Draw();

            draw.execute(splitCommand, state);
            state.addCommand(draw);
        }
    }
}
