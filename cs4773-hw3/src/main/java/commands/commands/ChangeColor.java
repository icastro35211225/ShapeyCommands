package commands.commands;

import commands.shapes.Shape;
import commands.shapes.Color;

public class ChangeColor {
    String color;

    public void execute(String color, Shape shape) {
        Color shapeColor = shape.getColor();
        shapeColor.execute(color);
    }
}
