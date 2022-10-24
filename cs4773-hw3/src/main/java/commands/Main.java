package commands;

import commands.commandManager.CareTaker;
import commands.commandManager.State;
import commands.handlers.HandlerChain;

public class Main {

    public static void main(String[] args) {
        String fileName = getFileName(args);
        State state = new State();
        HandlerChain handlerChain = new HandlerChain();

        CareTaker careTaker = new CareTaker(fileName, handlerChain, state);
        careTaker.readCommands();
    }

    public static String getFileName(String[] args) {
        String fileName = "";
        try {
            fileName = args[0];
        } catch (Exception e) {
            System.err.println("File not provided");
        }
        return fileName;
    }
}