package commands.handlers;

import java.util.ArrayList;

import commands.commandManager.State;

public class HandlerChain {
    private Handler firstHandler;
    private ArrayList<Handler> handlers = new ArrayList<Handler>();

    public HandlerChain() {
        CreateHandler createHandler = new CreateHandler();
        ColorHandler colorHandler = new ColorHandler();
        DeleteHandler deleteHandler = new DeleteHandler();
        DrawHandler drawHandler = new DrawHandler();
        DrawSceneHandler drawSceneHandler = new DrawSceneHandler();
        MoveHandler moveHandler = new MoveHandler();
        SelectHandler selectHandler = new SelectHandler();
        UndoHandler undoHandler = new UndoHandler();

        addHandler(createHandler);
        addHandler(colorHandler);
        addHandler(drawHandler);
        addHandler(drawSceneHandler);
        addHandler(moveHandler);
        addHandler(selectHandler);
        addHandler(undoHandler);

        createHandler.setNextHandler(colorHandler);
        colorHandler.setNextHandler(deleteHandler);
        deleteHandler.setNextHandler(drawHandler);
        drawHandler.setNextHandler(drawSceneHandler);
        drawSceneHandler.setNextHandler(moveHandler);
        moveHandler.setNextHandler(selectHandler);
        selectHandler.setNextHandler(undoHandler);
        undoHandler.setNextHandler(null);

        firstHandler = createHandler;
    }

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void handleRequest(String command, State state) {
        firstHandler.request(command, state);
    }
}
