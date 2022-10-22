package commands.commandManager;

import java.util.ArrayList;
import java.util.Stack;

import commands.commands.Command;
import commands.shapes.Shape;

public class State {
    public ArrayList<Shape> existingShapes = new ArrayList<Shape>();
    public Stack<Momento> momentos = new Stack<Momento>();
    public int currentShape = 0;

    public void addShape(Shape newShape) {
        existingShapes.add(newShape);
    }

    public void addCommand(Command newCommand) {
        Momento newMomento = new Momento(newCommand);
        momentos.add(newMomento);
    }

    public Momento popMomento() {
        return momentos.pop();
    }

    public void removeShape(int index) {
        existingShapes.remove(index);
    }

    public ArrayList<Shape> getExistingShapes() {
        return existingShapes;
    }

    public Shape getShape() {
        Shape retShape = null;
        try {
            retShape = existingShapes.get(currentShape);
        } catch (Exception e) {
            System.err.println(e);
        }
        return retShape;
    }

    public int getShapeIndex(Shape shape) {
        return existingShapes.indexOf(shape);
    }
}
