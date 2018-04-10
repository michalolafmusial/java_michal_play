package com.company;

import java.lang.Iterable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Set<String> s = new HashSet<>();
        s.add("jeden");
        s.add("dwa");
        s.add("trzy");
        s.add("cztery");

        //System.out.println(s);

        String[] arr = s.toArray(new String[s.size()]);

        Iterator<String> it = s.iterator();

        while (it.hasNext()) {
            String i = it.next();
            System.out.println(i);
        }

        //it.remove();

        for (int i = arr.length-1; i > -1  ; i--) {
            System.out.println("Element numer "+i+" to: "+arr[i]);

        }

        //int  a = 5;


    }
}
