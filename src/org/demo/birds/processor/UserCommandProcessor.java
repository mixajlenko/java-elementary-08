package org.demo.birds.processor;

import org.demo.birds.entities.Bird;

import java.util.Scanner;

/**
 * Реализовать интерфейсы IBirdCreator, IUserCommandProcessor, IInfiniteLoopProcessor
 */
public class UserCommandProcessor implements IBirdCreator, IUserCommandProcessor, IInfiniteLoopProcessor {

    @Override
    public Bird createBird(Scanner userInputReader) {
        return null;
    }

    @Override
    public void processInLoop() {




    }

    @Override
    public String processUserCommand(String command, Scanner userInputReader) {
       System.out.println("Please, enter command:\n" +
                "           a - add new Bird\n" +
                "           s - search bird by name\n" +
                "           l - search bird by living area\n" +
                "           exit - terminate application");

            System.out.println(command);
            return userInputReader.nextLine();

        switch (command) {
            case "a":
                Bird newBird =
                return;
            case "s":
                return;
            case "l":
                return;
            default:
                System.out.println("Unknown command.");
        }


        }


    }
