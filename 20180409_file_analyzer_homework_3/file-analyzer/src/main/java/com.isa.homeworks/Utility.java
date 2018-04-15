package com.isa.homeworks;

public class Utility {
    /**
     * Method to calculate seconds to hours and display result in a form: x hours, y minutes
     * @param inputSeconds
     * @return
     */
    public static String secondToHourMinuteStringConverter (double inputSeconds) {
        int hours = (int) (inputSeconds / 3600);
        int minutes = (int) ((inputSeconds % 3600) / 60);
        return ""+hours+" hour, "+minutes+" minutes";
    }
}
