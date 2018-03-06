package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private int wylosowana_liczba;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Fascynująca gra");
        int MAKS_PRZEDZIAL;
        int PODANA_PRZEZ_USERA;
        System.out.println("Wylosuj liczbę z przedziału od 1 do ?");
        Scanner odczyt1 = new Scanner(System.in);
        MAKS_PRZEDZIAL = odczyt1.nextInt();

        System.out.println("Wybrany przedział to 1.."+MAKS_PRZEDZIAL);

        int wylosowana_liczba;

        Random generator = new Random();

        wylosowana_liczba = generator.nextInt(MAKS_PRZEDZIAL)+1;

        System.out.println("Wylosowana liczba to: "+wylosowana_liczba);

        System.out.println("Wylosowano liczbe. Zgadnij jaką. Ile chcesz prób?");

        int ilosc_prob;
        Scanner odczyt3 = new Scanner(System.in);
        ilosc_prob = odczyt3.nextInt();

        int licznik  = 1;
        int podana_liczba;
        boolean success = false;
        while (licznik < (ilosc_prob+1) && !success) {
            System.out.println("Proba #"+licznik);
            Scanner odczyt2 = new Scanner(System.in);
            podana_liczba = odczyt2.nextInt();
            if (podana_liczba == wylosowana_liczba) {

                success = true;
                System.out.println("Brawo, zgadłeś po ilości prób #"+licznik);
            }
            licznik++;
        }

       if (!success) {System.out.println("Niestety, nie zgadłeś!!");}
    }
}
