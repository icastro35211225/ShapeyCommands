package commands.commandManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import commands.handlers.HandlerChain;

public class CareTaker {
    private String filename;
    private HandlerChain handlerChain;
    private State state;

    public CareTaker(String filename, HandlerChain handlerChain, State state) {
        this.filename = filename;
        this.handlerChain = handlerChain;
        this.state = state;
    }

    public void readCommands() {
        try {
            File commandFile = new File(filename);
            Scanner fileReader = new Scanner(commandFile);
            while (fileReader.hasNextLine()) {
                String currentCommand = fileReader.nextLine();
                handlerChain.handleRequest(currentCommand, state);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
