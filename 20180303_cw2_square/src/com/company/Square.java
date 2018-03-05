package com.company;

public class Square {

    private double side;
    private double bok;

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    double calculateArea() {
        double area = side * side;
        return area;
    }
}
