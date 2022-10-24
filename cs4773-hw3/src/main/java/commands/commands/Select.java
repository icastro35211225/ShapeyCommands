package commands.commands;

import commands.commandManager.State;

public class Select implements Command {
    int prevIndex = 0;

    public void execute(String[] command, State state) {
        int index = Integer.parseInt(command[1]);
        if ((index - 1) >= 0 && (index - 1) < state.existingShapes.size()) {
            prevIndex = state.getCurrentShape();
            state.setCurrentShape(index - 1);
        } else {
            System.out.println("ERROR: invalid shape for SELECT");
        }
    }

    public void undo(State state) {
        state.setCurrentShape(prevIndex);
    }
}
