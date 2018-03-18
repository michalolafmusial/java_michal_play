package com.company;

import java.time.LocalDate;
import static java.lang.System.*;


class Person {

    private String name;
    private String surname;
    private LocalDate date;
    private static int peopleCount = 0;

    public Person(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.date = LocalDate.of(1982, 1, 29);
        peopleCount++;
    }


    public static int getPeopleCount() {
        return peopleCount;
    }

//konstruktor
    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }

    public static void getPopulation(int populacja) {
        out.println(peopleCount);
    }


}
