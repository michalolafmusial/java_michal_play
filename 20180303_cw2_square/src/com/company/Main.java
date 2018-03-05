package com.company;

public class Main {

    public static void main(String[] args) {
        // stworzenie nowego kwadratu
        Square s1 = new Square();
        // ustawienie boku = 5
        s1.setSide(5);
        // wydrukowanie obliczonego pola
        System.out.println(s1.calculateArea());

        // stworzenie nowego prostokata
        Rectangle r1 = new Rectangle();
        // przypisanie dlugosci i szerokosci
        r1.setHeight(6);
        r1.setWeight(9);
        // wypisanie obliczonego pola prostokata
        System.out.println(r1.calculateAreaRectangle());
    }


}
