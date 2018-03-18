package com.company;

import java.util.Random;

class Game {

    private int numberToGuess;
    private boolean checkNumbers = false;
    private int numberOfTriesToFinish;
    private int numberOfTriesBeforeSuccess;

    public int numberToGuess() {
        return numberToGuess;
    }

    public boolean isCheckNumbers() {
        return checkNumbers;
    }

    public int getNumberOfTriesToFinish() {
        return numberOfTriesToFinish;
    }

    public int getNumberOfTriesBeforeSuccess() {
        return numberOfTriesBeforeSuccess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void setCheckNumbers(boolean checkNumbers) {
        this.checkNumbers = checkNumbers;
    }

    public void setNumberOfTriesToFinish(int numberOfTriesToFinish) {
        this.numberOfTriesToFinish = numberOfTriesToFinish;
    }

    public void setNumberOfTriesBeforeSuccess(int numberOfTriesBeforeSuccess) {
        this.numberOfTriesBeforeSuccess = numberOfTriesBeforeSuccess;
    }

    public int generateNumberToGuess(int range) {
        Random generator = new Random();
        numberToGuess = generator.nextInt(range) + 1;
       // System.out.println("Liczba do zgadniecia to: " + numberToGuess);
        return numberToGuess;
    }

    public boolean compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            checkNumbers = true;
        }
        return checkNumbers;
    }

    public void printResults(int userTries) {
        if (checkNumbers) {
            System.out.println("Brawo, zgadles po " + (userTries) + " próbach");
        } else {
            System.out.println("Nie zgadles");
        }
    }

    public int gameLoop() {

        Player gra1 = new Player();
        gra1.provideMaxRangeFromUser();
        gra1.provideNumberOfTriesFromUser();
        generateNumberToGuess(gra1.getMaxRange());
        numberOfTriesToFinish = gra1.getNumberOfTries();
        numberOfTriesBeforeSuccess = 0;
        System.out.println("ZACZYNAMY:");
        System.out.println("Wybrany przedział to 1..: " + gra1.getMaxRange());
        System.out.println("Ilość prób: " + gra1.getNumberOfTries());
        System.out.println(" ");

        while (gra1.getNumberOfTries() > 0 && !checkNumbers) {
            numberOfTriesBeforeSuccess++;
            System.out.print("Próba #"+numberOfTriesBeforeSuccess+" :");
            gra1.provideUserNumberFromUser();
            compareNumbers(gra1.getUserNumber(), numberToGuess);
            numberOfTriesToFinish--;

        }

        return numberOfTriesBeforeSuccess;
    }
}

