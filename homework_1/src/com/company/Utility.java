package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
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
}
