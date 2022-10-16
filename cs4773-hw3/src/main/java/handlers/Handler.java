package handlers;

import commands.shapes.Shape;

public interface Handler {
    Handler nextHandler = null;

    public void request(String command, Shape shape);
}
