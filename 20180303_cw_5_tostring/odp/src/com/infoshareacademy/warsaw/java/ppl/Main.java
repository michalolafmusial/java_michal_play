package com.infoshareacademy.warsaw.java.ppl;

public class Main {
    public static void main(String... args) {
        Person first = new Person().name("John").surname("Smith").dayOfBirth((byte) 26).monthOfBirth((byte) 1)
                                   .yearOfBirth((short) 1982);

        Person second = new Person().name("Johnny").surname("Rambo").dayOfBirth((byte) 26).monthOfBirth((byte) 1)
                                    .yearOfBirth((short) 1982);

        Person third = new Person().name("Johnny").surname("Rambo").dayOfBirth((byte) 26).monthOfBirth((byte) 2)
                                   .yearOfBirth((short) 1982);

        Person fourth = new Person().name("Johnny").surname("Rambo").dayOfBirth((byte) 26).monthOfBirth((byte) 2)
                                    .yearOfBirth((short) 1982);

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(first.equals(fourth));

        System.out.println(second.equals(third));
        System.out.println(second.equals(fourth));

        System.out.println(third.equals(fourth));

        System.out.println(first);
    }
}

class Person {
    private String name;
    private String surname;
    private byte dayOfBirth;
    private byte monthOfBirth;
    private short yearOfBirth;

    void introduceYourself() {
        System.out.println("Hi, my name is " + name + " " + surname + ".");
    }

    Person name(String name) {
        setName(name);
        return this;
    }

    Person surname(String surname) {
        setSurname(surname);
        return this;
    }

    Person dayOfBirth(byte dayOfBirth) {
        setDayOfBirth(dayOfBirth);
        return this;
    }

    Person monthOfBirth(byte monthOfBirth) {
        setMonthOfBirth(monthOfBirth);
        return this;
    }

    Person yearOfBirth(short yearOfBirth) {
        setYearOfBirth(yearOfBirth);
        return this;
    }

    void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        }
    }

    void setSurname(String surname) {
        if (name != null && !name.trim().isEmpty()) {
            this.surname = surname;
        }
    }

    void setDayOfBirth(byte dayOfBirth) {
        if (dayOfBirth > 0 && dayOfBirth < 32) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    void setMonthOfBirth(byte monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth < 13) {
            this.monthOfBirth = monthOfBirth;
        }
    }

    void setYearOfBirth(short yearOfBirth) {
        if (yearOfBirth > 1900) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (dayOfBirth != person.dayOfBirth) {
            return false;
        }
        if (monthOfBirth != person.monthOfBirth) {
            return false;
        }
        if (yearOfBirth != person.yearOfBirth) {
            return false;
        }
        if (!name.equals(person.name)) {
            return false;
        }
        return surname.equals(person.surname);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", dayOfBirth=" + dayOfBirth
                + ", monthOfBirth=" + monthOfBirth + ", yearOfBirth=" + yearOfBirth + '}';
    }
}