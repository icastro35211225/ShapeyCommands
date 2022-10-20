package commands.handlers;

import commands.commandManager.State;
import commands.commandManager.main;
import commands.commands.Command;
import commands.shapes.Shape;

public class UndoHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommand = command.split(" ");

        if (!splitCommand[0].equals("UNDO")) {
            nextHandler.request(command, shape);
        }

        // pop from command stack, or obj command
        // and call the popped obj's undo function
        Command oldCommand = State.commandStack.pop();
    }
}
