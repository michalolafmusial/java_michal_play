package com.company;

import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

public class Main {

    private int wylosowanaLiczba;

    public void setWylosowanaLiczba(int wylosowanaLiczba) {
        this.wylosowanaLiczba = wylosowanaLiczba;
    }


    public static void main(String[] args) {

        System.out.println("Fascynująca gra");
        System.out.println("Wylosuj liczbę z przedziału od 1 do ?");

        String maxRange;
        Scanner odczyt = new Scanner(System.in);
        maxRange = odczyt.nextLine();

        if (!Utility.numberOrNot(maxRange)) {
            Utility.exitIfNotNumber();
        } else {
            System.out.println("Wybrany przedział to 1.." + maxRange);
        }
        ;


        int numberToGuess;
        Random generator = new Random();
        numberToGuess = generator.nextInt(Integer.parseInt(maxRange)) + 1;

        //   System.out.println("Wylosowana liczba to: " + numberToGuess);

        System.out.println("Wylosowano liczbe. Zgadnij jaką. Ile chcesz prób?");

        String numberOfTries;
        numberOfTries = odczyt.nextLine();

        if (!Utility.numberOrNot(numberOfTries)) {
            Utility.exitIfNotNumber();
        } else {
            System.out.println("Ilość prób: " + numberOfTries);
        }
        ;

        int licznik = 1;
        String userNumber;
        boolean success = false;
        while (licznik < (Integer.parseInt(numberOfTries) + 1) && !success) {
            System.out.println("Proba #" + licznik);
            userNumber = odczyt.nextLine();

            if (!Utility.numberOrNot(userNumber)) {
                Utility.exitIfNotNumber();
            } else {


                if (Integer.parseInt(userNumber) == numberToGuess) {
                    success = true;
                    System.out.println("Brawo, zgadłeś po ilości prób #" + licznik + " :)");
                }
                licznik++;

            }


        }

        if (!success) {
            System.out.println("Niestety, nie zgadłeś :(");
        }
    }
}
