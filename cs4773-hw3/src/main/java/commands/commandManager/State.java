package commands.commandManager;

import java.util.ArrayList;
import java.util.Stack;

import commands.commands.Command;
import commands.shapes.Origin;
import commands.shapes.Shape;

public class State {
    public ArrayList<Shape> existingShapes;
    public Stack<Momento> momentos;
    public int currentShape = -1;

    public State() {
        existingShapes = new ArrayList<Shape>();
        momentos = new Stack<Momento>();
    }

    public void addShape(Shape newShape) {
        existingShapes.add(newShape);
    }

    public void addShape(int index, Shape shape) {
        existingShapes.add(index, shape);
    }

    public void addCommand(Command newCommand) {
        Momento newMomento = new Momento();
        newMomento.setCommand(newCommand);
        momentos.add(newMomento);
    }

    public Momento popMomento() {
        return momentos.pop();
    }

    public void removeShape(int index) {
        existingShapes.remove(index);
    }

    public void removeShape(Shape shape) {
        existingShapes.remove(shape);
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

    public int getCurrentShape() {
        return currentShape;
    }

    public int getShapeIndex(Shape shape) {
        return existingShapes.indexOf(shape);
    }

    public void setCurrentShape(int index) {
        this.currentShape = index;
    }

    public void setOrigin(Origin origin) {
        existingShapes.get(currentShape).setOrigin(origin);
    }
}
