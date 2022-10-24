package commands.handlers;

import commands.commandManager.State;
import commands.commands.*;

public class CreateHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, State state) {
        String[] splitCommand = command.split(" ");
        if (!splitCommand[0].equals("CREATE")) {
            nextHandler.request(command, state);
        } else {

            if (splitCommand[1].equals("CIRCLE")) {
                try {
                    Integer.parseInt(splitCommand[2]);
                } catch (Exception e) {
                    System.err.println(e);
                }

                CreateCircle createCircle = new CreateCircle();

                createCircle.execute(splitCommand, state);
                state.addCommand(createCircle);

            } else if (splitCommand[1].equals("RECTANGLE")) {
                try {
                    Integer.parseInt(splitCommand[2]);
                    Integer.parseInt(splitCommand[3]);
                } catch (Exception e) {
                    System.err.println(e);
                }

                CreateRectangle createRectangle = new CreateRectangle();

                createRectangle.execute(splitCommand, state);
                state.addCommand(createRectangle);
            }
        }
    }
}
