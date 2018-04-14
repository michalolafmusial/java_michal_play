package com.isa.homeworks;

public class Utility {

    public static String secondToHourMinuteStringConverter (double inputSeconds) {
        int hours = (int) (inputSeconds / 3600);
        int minutes = (int) ((inputSeconds % 3600) / 60);
        return ""+hours+" hour, "+minutes+" minutes";
    }
}
