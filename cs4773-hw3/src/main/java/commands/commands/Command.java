package commands.commands;

public abstract class Command {
    String commandLine;

    abstract void undo();
}
