package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        // int age = 21;
        String zmienna = "Text";
        System.out.println(zmienna);
        changeString(zmienna);
        System.out.println(zmienna);
        // Person person = new Person("John");

        // change(person, age);

        // System.out.println("Changed age: " + age);
        // person.introduceYourself();
    }

    private static void change(Person p, int i) {
        i = i + 5;
        p.setName("new name");
        System.out.println("Changed i: " + i);
    }

    private static void changeString(String zmienna) {
        zmienna += "changed";
        System.out.println(zmienna);


    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void introduceYourself() {
        System.out.println("Hi, my name is " + name + ".");
    }

    void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        }
    }
}
