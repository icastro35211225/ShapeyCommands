package commands.commands;

import commands.shapes.Shape;

public class Draw {

    public void execute(Shape shape) {
        System.out.println(shape.draw());
    }
}
