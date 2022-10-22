package commands.commands;

import java.util.ArrayList;

import commands.commandManager.State;
import commands.shapes.Shape;

public class DrawScene implements Command {

    public void execute(String[] commnad, State state) {
        ArrayList<Shape> shapes = state.existingShapes;
        for (Shape currentShape : shapes) {
            System.out.println(currentShape.draw());
        }
    }

    public void undo(String[] command, State state) {

    }
}
