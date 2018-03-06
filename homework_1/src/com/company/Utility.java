package com.company;

import java.lang.Integer;


public class Utility {

    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }

    static void exitIfNotNumber ()

    {
            System.out.println("To nie liczba");
            System.exit(0);
    }



}
