package commands.commandManager;

import java.util.ArrayList;
import java.util.Stack;

import commands.shapes.Shape;

public class State {
    static ArrayList<Shape> existingShapes = new ArrayList<Shape>();
    Stack<Command> commandStack = new Stack<Command>();

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
}
