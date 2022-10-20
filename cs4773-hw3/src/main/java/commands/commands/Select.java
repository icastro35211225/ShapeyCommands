package commands.commands;

import commands.commandManager.State;

public class Select {
    static int selectedShape = 0;
    static int prevShape = 0;

    public static void execute(int index) {
        prevShape = selectedShape;
        selectedShape = index;

        State.currentShape = index;
    }

    public void undo() {

    }
}
