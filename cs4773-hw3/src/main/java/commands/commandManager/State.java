package commands.commandManager;

import java.util.ArrayList;
import java.util.Stack;

import commands.shapes.Shape;

public class State {
    public static ArrayList<Shape> existingShapes = new ArrayList<Shape>();
    public static Stack<main> commandStack = new Stack<main>();
    public static Shape currentShape = null;

    public void addShape(Shape newShape) {
        existingShapes.add(newShape);
    }

    public void addCommand(main newCommand) {
        commandStack.add(newCommand);
    }

    public main popCommand() {
        return commandStack.pop();
    }

    public void removeShape(int index) {
        existingShapes.remove(index);
    }

    public static ArrayList<Shape> getExistingShapes() {
        return existingShapes;
    }
}
