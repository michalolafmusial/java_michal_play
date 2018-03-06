package com.company;

import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;


public class Main {

    private int wylosowana_liczba;

    public void setWylosowana_liczba(int wylosowana_liczba) {
        this.wylosowana_liczba = wylosowana_liczba;
    }


    public static void main(String[] args) {

        System.out.println("Fascynująca gra");
        System.out.println("Wylosuj liczbę z przedziału od 1 do ?");

        String MAKS_PRZEDZIAL;
        Scanner odczyt1 = new Scanner(System.in);
        MAKS_PRZEDZIAL = odczyt1.nextLine();

        if (!Utility.numberOrNot(MAKS_PRZEDZIAL)) {
            System.out.println("To nie liczba");
            System.exit(0);
        } else {
            System.out.println("Wybrany przedział to 1.." + MAKS_PRZEDZIAL);
        }
        ;


        int WYLOSOWANA_LICZBA;
        Random generator = new Random();
        WYLOSOWANA_LICZBA = generator.nextInt(Integer.parseInt(MAKS_PRZEDZIAL)) + 1;

        //   System.out.println("Wylosowana liczba to: " + WYLOSOWANA_LICZBA);

        System.out.println("Wylosowano liczbe. Zgadnij jaką. Ile chcesz prób?");

        String ILOSC_PROB;
        Scanner odczyt3 = new Scanner(System.in);
        ILOSC_PROB = odczyt3.nextLine();

        if (!Utility.numberOrNot(ILOSC_PROB)) {
            System.out.println("To nie liczba");
            System.exit(0);
        } else {
            System.out.println("Ilość prób: " + ILOSC_PROB);
        }
        ;

        int licznik = 1;
        String PODANA_LICZBA;
        boolean success = false;
        while (licznik < (Integer.parseInt(ILOSC_PROB) + 1) && !success) {
            System.out.println("Proba #" + licznik);
            Scanner odczyt2 = new Scanner(System.in);
            PODANA_LICZBA = odczyt2.nextLine();

            if (!Utility.numberOrNot(PODANA_LICZBA)) {
                System.out.println("To nie liczba");
                System.exit(0);
            } else {


                if (Integer.parseInt(PODANA_LICZBA) == WYLOSOWANA_LICZBA) {
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
