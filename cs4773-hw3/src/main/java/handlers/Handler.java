package handlers;

public interface Handler {
    Handler nextHanlder = null;

    public void request();
}
