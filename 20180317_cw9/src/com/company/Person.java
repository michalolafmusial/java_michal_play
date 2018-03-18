package com.company;

import java.time.LocalDate;

class Person {

    private String name;
    private String surname;
    private LocalDate date;

    public Person(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.date = LocalDate.of(1982, 1, 29 );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }


}
