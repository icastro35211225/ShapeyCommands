package commands.commands;

import commands.shapes.Shape;

public class Move {

    public static void execute(Shape shape, double[] coordinates) {
        shape.setOrigin(coordinates);
    }

    public void undo() {

    }
}
