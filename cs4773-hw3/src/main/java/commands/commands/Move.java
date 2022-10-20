package commands.commands;

import commands.shapes.Shape;

public class Move extends Command {
    static double[] coordinates = null;
    static double[] prevCoordinates = null;

    public static void execute(Shape shape, double[] newCoords) {
        prevCoordinates = coordinates;
        coordinates = newCoords;
        shape.setOrigin(coordinates);
    }

    public void undo() {
        // I store the command string, so I can try to use that so I
        // don't pass anything
        coordinates = prevCoordinates;
    }
}
