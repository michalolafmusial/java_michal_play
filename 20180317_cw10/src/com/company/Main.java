package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person mm = new Person("Michal", "Musial", 29, 01, 1982);
        out.println(mm);

        Person mm2 = new Person("Michal2", "Musial", 29, 01, 1982);
        out.println(mm);

        Person mm3 = new Person("Michal3", "Musial", 29, 01, 1982);
        out.println(mm);

        Person.getPopulation(Person.getPeopleCount());

    }

}
