package commands.commands;

import commands.shapes.Shape;

public abstract class Command {

    public abstract void execute(Shape... shape);

}
