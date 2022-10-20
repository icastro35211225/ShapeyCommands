package commands.commands;

import commands.shapes.Shape;

public abstract class Command {
    String commandLine;

    abstract void undo();
}
