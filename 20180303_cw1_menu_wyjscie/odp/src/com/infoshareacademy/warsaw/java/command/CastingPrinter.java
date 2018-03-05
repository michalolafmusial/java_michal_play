package com.infoshareacademy.warsaw.java.command;

class CastingPrinter implements Command {
    @Override
    public void execute() {
        System.out.println("W ramach hierarchii klas oraz przy typach prostych (jak 'int'), możemy korzystać z tzw. rzutowania.\n"
                + "Pozwala to traktować zmienną jako zmienną innego typu, np.\n"
                + "byte num = 36; char test = (char) num;\n\n"
                + "W przypadku obiektów, warto sprawedzić, czy rzutowanie zadziała. Pomocny jest tu operator 'instanceof'.");
    }
}
