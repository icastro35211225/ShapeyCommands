package commands.commandManager;

import commands.commands.Command;

public class Momento {
    Command command;

    public Momento() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
