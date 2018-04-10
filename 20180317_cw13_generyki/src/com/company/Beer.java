package com.company;

class Beer implements Alcohol {

    @Override
    public double getPersentage() {
        return 0.05;
    }

    @Override
    public String getName() {
        return "Beer";

    }
}
