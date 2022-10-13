package handlers;

public interface Handler {
    Handler nextHandler = null;

    public void request(String command);
}
