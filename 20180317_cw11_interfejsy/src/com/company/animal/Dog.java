package com.company.animal;

public class Dog implements Animal {

    private Moveable runBehavior = new Runner();
    private Noisy noiseBehavior = new Barker();

    @Override
    public void move() {
        runBehavior.move();
    }

    @Override
    public void makeNoise() {
        noiseBehavior.makeNoise();

    }


}
