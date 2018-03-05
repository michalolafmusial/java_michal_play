package com.company;

public class Main {

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(5);
        System.out.println(s1.calculateArea());

        Rectangle r1 = new Rectangle();
        r1.setHeight(6);
        r1.setWeight(9);
        System.out.println(r1.calculateAreaRectangle());
    }


}
