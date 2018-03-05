package com.infoshareacademy.warsaw.java;

import java.util.Scanner;

import com.infoshareacademy.warsaw.java.command.CommandFactory;

public class Main {
    private static CommandFactory commands = CommandFactory.init();

    public static void main(String... args) {
        boolean finished = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Aby zakończyć, wpisz 'exit'.\n");
        while (!finished) {
            commands.execute("menu");

            System.out.print("Twój wybór: ");
            String input = reader.next();

            finished = input.equals("exit");

            System.out.println();
            commands.execute(input);
            System.out.println();
        }

        reader.close();
    }
}
