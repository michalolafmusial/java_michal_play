package com.company;

public class Main {
    public static void main(String[] args) {
        Rect r = new Rect(5, 4);
        Square sq = new Square(5);
    }
}
System.out.println(calculatePrismVolume(r, 10));
        System.out.println(calculatePrismVolume(sq, 10));

static double calculatePrismVolume(Figure base, double height) {
        return base.calculateArea() * height;
        }
abstract class Figure {
    abstract double calculateArea();
}
class Rect extends Figure {
    private double a;
    private double b;
    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    double calculateArea() {
        return a * b;
    }
}
class Square extends Rect {
    Square(double a) {
        super(a, a);
    }
}