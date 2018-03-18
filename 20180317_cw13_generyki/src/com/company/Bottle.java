package com.company;

class Bottle<T extends Alcohol> {
    private T liquid;

    public void fill(T liquid) {
        this.liquid = liquid;
    }
}
