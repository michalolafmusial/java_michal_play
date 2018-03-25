package com.infoshareacademy.warsaw.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.infoshareacademy.warsaw.java.ppl.Person;

public class Main {
    public static void main(String... args) {
        //@formatter:off
        List<Person> people = Arrays.asList(
                new Person().name("John").age(21),
                new Person().name("Margaret").age(5),
                new Person().name("Mario").age(44),
                new Person().name("Jack").age(14),
                new Person().name("Edgar").age(19)
        );
        //@formatter:on

        List<Person> adultPeople = new ArrayList<>(people);
        for (int i=0; i<people.size(); i++) {
            if (people.get(i).getAge() < 18) {
                System.out.println("Name: " + adultPeople.get(i).getName() + " age: " + adultPeople.get(i).getAge());
                adultPeople.remove(i);
                //System.out.println("Name: " + people.get(i).getName() + " age: " + people.get(i).getAge());
            }
           // System.out.println("Name: "+people.get(0).getName());
        };
        System.out.println(adultPeople);
        System.out.println(people);

        //adultPeople.set(0, )

        //List<String> adultPeople = Arrays.asList(




    }
}