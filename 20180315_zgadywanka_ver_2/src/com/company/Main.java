package com.company;

public class Main {

    public static void main(String[] args) {

        Game gra = new Game();
        gra.gameLoop();
        gra.printResults(gra.getNumberOfTriesBeforeSuccess());
    }
}
