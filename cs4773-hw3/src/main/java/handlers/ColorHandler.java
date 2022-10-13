package handlers;

public class ColorHandler implements Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void request(String command) {
        String[] splitCommand = command.split(command);
        if (!splitCommand[0].equals("COLOR")) {
            nextHandler.request(command);
        }
    }
}
