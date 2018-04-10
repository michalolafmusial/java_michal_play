package com.company;

class Whisky implements Alcohol {

    @Override
    public double getPersentage() {
        return 0.4;
    }

    @Override
    public String getName() {
        return "Whisky";

    }
}
