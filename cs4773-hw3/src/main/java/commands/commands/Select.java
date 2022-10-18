package commands.commands;

import commands.commandManager.State;
import commands.shapes.Shape;

public class Select {
    static Shape selectedShape = null;
    static Shape prevShape = null;

    public static void execute(Shape shape) {
        prevShape = selectedShape;
        selectedShape = shape;

        State.currentShape = shape;
    }
}
