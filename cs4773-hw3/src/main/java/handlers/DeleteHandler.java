package handlers;

import commands.commands.Delete;

public class DeleteHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command) {
        String[] splitCommad = command.split(" ");

        if (!splitCommad[0].equals("DELETE")) {
            nextHandler.request(command);
        }

        try {
            int index = Integer.parseInt(splitCommad[1]);
            Delete delete = new Delete();
            delete.execute(index);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
