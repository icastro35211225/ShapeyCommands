package commands.commandManager;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Stack;

import commands.shapes.Circle;
import commands.shapes.Rectangle;
import commands.shapes.Shape;

public class Command {
    public static Stack<String> commandStack = new Stack<String>();
    public static ArrayList<Shape> shapes = new ArrayList<Shape>();
    public static int stackSize = 0;
    public static Shape currentShape = null;

    public static void main(String[] args) {
        String filePath = args[0];
        InputStream inputStream = new Command().getClass().getResourceAsStream(filePath);
        // String fileContents = new String(inputStream.readAllBytes());
        // while () {
        // String[] userCommand = userInput.split(" ");
        // commandParser(userCommand, userInput);
        // }

    }

    // NO SWITCH staement, just pass it to CREATE, and check if it a create, if not
    // pass it the next one, until a command says that it finds it's their command
    public static void commandParser(String[] userCommand, String userInput) {

    }

    public static void createCircle(int radius) {
        Circle newCricle = new Circle(radius);
        shapes.add(newCricle);
    }

    public static void createRectangle(int height, int width) {
        Rectangle newRectangle = new Rectangle(height, width);
        shapes.add(newRectangle);
    }

    public static void select(int index) {
        if (shapes.size() == 0) {
            System.out.println("ERROR: no shapes created to SELECT");
        }

        try {
            currentShape = shapes.get(index);
        } catch (Exception e) {
            System.out.println("ERROR: invalid shape for SELECT");

        }
    }

    public static void move(int x, int y) {
        int[] oldShapePoints = currentShape.getOrigin();
        stackSize = commandStack.size();
        commandStack.add("MOVE " + oldShapePoints[0] + " " + oldShapePoints[2]);

        int[] newOrigin = { x, y };
        currentShape.setOrigin(newOrigin);
    }
}