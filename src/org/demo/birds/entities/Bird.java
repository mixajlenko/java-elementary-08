package org.demo.birds.entities;

import java.util.Scanner;

/**
 * Bird.
 *
 * Должны быть следущие свойства:
 *
 * name  тип String
 * livingArea тип String
 * size – число с плавающей точкой, может быть незаполненным (Double).
 *
 */
public class Bird {

    private String name;

    private String livingArea;

    private /*Double*/String size;

    public Bird(String name, String livingArea, String size) {
        this.name = name;
        this.livingArea = livingArea;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String readLineFromConsole (Scanner consoleInputReader, String message) {
        System.out.println(message);
        return consoleInputReader.nextLine();
    }

    public Bird getNewBird() {
        Scanner consoleInputReader = new Scanner(System.in);

         name = readLineFromConsole(consoleInputReader, "Please enter bird name:");
         livingArea = readLineFromConsole(consoleInputReader, "Please enter living area:");
         size = readLineFromConsole(consoleInputReader, "Please enter bird size:");

        return getNewBird();

    }






}
