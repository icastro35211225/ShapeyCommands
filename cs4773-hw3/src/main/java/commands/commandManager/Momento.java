package commands.commandManager;

import commands.commands.Command;

public class Momento {
    Command command;

    public Momento(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
