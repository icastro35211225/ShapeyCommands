package handlers;

import commands.commands.Delete;
import commands.shapes.Shape;

public class DeleteHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command, Shape shape) {
        String[] splitCommad = command.split(" ");

        if (!splitCommad[0].equals("DELETE")) {
            nextHandler.request(command, shape);
        }

        try {
            int index = Integer.parseInt(splitCommad[1]);
            Delete delete = new Delete();
            delete.execute(shape);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
