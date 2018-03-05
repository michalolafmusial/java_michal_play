package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Figure tr = new Triangle(23,2);
        // Square s1 = new Square();
        // s1.setSide(5);
        // System.out.println(s1.calculateArea());

        // Rectangle r1 = new Rectangle();
        // r1.setHeight(6);
        // r1.setWeight(9);
        // System.out.println(r1.calculateAreaRectangle());
    }
}

abstract class Figure {
    protected String name;
    abstract void calculateArea(double);

    Figure(String name) {
        this.name = name;
    }
}

class Triangle extends Figure {
    Triangle(String height, String base) {
        super(height);
        super(base);
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle");
    }
}



