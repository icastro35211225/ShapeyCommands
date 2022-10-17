package commands.commands;

import java.util.ArrayList;

import commands.shapes.Shape;

public class DrawScene {

    public void execute(ArrayList<Shape> shapes) {
        for (Shape currentShape : shapes) {
            System.out.println(currentShape.draw());
        }
    }
}
