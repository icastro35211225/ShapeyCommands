package commands.commandManager;

import java.util.ArrayList;
import java.util.Stack;

import commands.commands.Command;
import commands.shapes.Shape;

public class State {
    public static ArrayList<Shape> existingShapes = new ArrayList<Shape>();
    public static Stack<Command> commandStack = new Stack<Command>();
    public static int currentShape = 0;

    public void addShape(Shape newShape) {
        existingShapes.add(newShape);
    }

    public void addCommand(Command newCommand) {
        commandStack.add(newCommand);
    }

    public Command popCommand() {
        return commandStack.pop();
    }

    public void removeShape(int index) {
        existingShapes.remove(index);
    }

    public static ArrayList<Shape> getExistingShapes() {
        return existingShapes;
    }

    public Shape getShapeIndex(int index) {
        Shape retShape = null;
        try {
            retShape = existingShapes.get(index);
        } catch (Exception e) {
            System.err.println(e);
        }
        return retShape;
    }
}
