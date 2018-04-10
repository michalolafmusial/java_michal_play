package com.company;

import java.util.Scanner;
import java.lang.Integer;

class Player {
    private int maxRange;
    private int numberOfTries;
    private int userNumber;

    public int getMaxRange() {
        return maxRange;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setMaxRange(String maxRange) {

        if (!numberOrNot(maxRange) || Integer.parseInt(maxRange) < 1 ) {
            System.out.println("Nieprawidłowa liczba");
            System.exit(0);
        } else {
            this.maxRange = Integer.parseInt(maxRange);
        }
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int provideMaxRangeFromUser() {
        System.out.println("Podaj zakres 1..n");
        Scanner odczyt = new Scanner(System.in);
        setMaxRange(odczyt.nextLine());
        //maxRange = Integer.parseInt(odczyt.nextLine());

        return maxRange;
    }


    public int provideNumberOfTriesFromUser() {
        System.out.println("Podaj liczbę prób:");
        Scanner odczyt = new Scanner(System.in);
        numberOfTries = Integer.parseInt(odczyt.nextLine());


        return numberOfTries;
    }

    public int provideUserNumberFromUser() {
        System.out.println("Podaj liczbę:");
        Scanner odczyt = new Scanner(System.in);
        userNumber = Integer.parseInt(odczyt.nextLine());
       // System.out.println("user number: " + userNumber);

        return userNumber;
    }

    static boolean numberOrNot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
