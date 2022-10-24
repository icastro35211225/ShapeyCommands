package commands.handlers;

import commands.commandManager.State;
import commands.commands.Move;

public class MoveHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("MOVE")) {
            nextHandler.request(command, state);
        } else {

            try {
                Integer.parseInt(splitCommand[1]);
                Integer.parseInt(splitCommand[2]);
            } catch (Exception e) {
                System.err.println(e);
            }

            Move move = new Move();

            move.execute(splitCommand, state);
            state.addCommand(move);
        }
    }
}
