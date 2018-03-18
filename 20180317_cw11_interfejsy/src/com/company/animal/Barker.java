package com.company.animal;

class Barker implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Woof, woof");
    }
}
