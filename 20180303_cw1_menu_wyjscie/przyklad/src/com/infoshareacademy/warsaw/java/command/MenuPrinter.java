package com.infoshareacademy.warsaw.java.command;

class MenuPrinter implements Command {
    @Override
    public void execute() {
        System.out.println("----- Witamy w super wprowadzeniu do Javy -----");
        System.out.println("\t1. importy");
        System.out.println("\t2. instrukcje warunkowe");
        System.out.println("\t3. pętle");
        System.out.println("\t4. typy proste, tablice");
        System.out.println("\t5. rzutowanie");
        System.out.println("----- ----------------------------------- -----");
    }
}
