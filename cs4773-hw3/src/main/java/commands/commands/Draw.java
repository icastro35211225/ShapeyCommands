package commands.commands;

import commands.shapes.Shape;

public class Draw extends Command {

    public void execute(Shape shape) {
        System.out.println(shape.draw());
    }

    public void undo() {

    }
}
