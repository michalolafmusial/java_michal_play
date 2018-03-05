package com.company;

public class Rectangle {

    private double weight;
    private double height;

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
    }

    double calculateAreaRectangle() {
        double areaRectangle = height * weight;
        return areaRectangle;
    }
}
