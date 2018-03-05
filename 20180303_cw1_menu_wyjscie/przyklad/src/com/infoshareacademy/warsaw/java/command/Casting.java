package com.infoshareacademy.warsaw.java.command;

class Casting implements Command {
    @Override
    public void execute() {
        System.out.println("W ramach hierarchii klas oraz przy typach prostych (jak 'int'), możemy\n" +
                "korzystać z tzw. rzutowania. Pozwala to traktować zmienną jako zmienną\n" +
                "innego typu, np. byte num = 36; char test = (char) num;\n" +
                "\n" +
                "W przypadku obiektów, warto sprawdzić, czy rzutowanie zadziała.\n" +
                "Pomocny jest tu operator 'instanceof'.");
    }
}
