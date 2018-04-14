package com.isa.homeworks;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        App.menu();

    }

    public static void menu () throws IOException {
        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();

        Statictics statictics = new Statictics();
        System.out.println("********Network activity analyzer*******");
        System.out.println("1) All activities count: "+statictics.counter());
        System.out.println("2) Statistics for all activities");
        System.out.println("  a) Shortest activity time: "+statictics.shortestActivityObject().getSpent_time());
        System.out.println("  b) Longest  activity time: "+statictics.longestActivityObject().getSpent_time());
        System.out.println("  c) Average  activity time: "+statictics.averageActivityTime());
        System.out.println("  d) Total    activity time: "+Utility.secondToHourMinuteStringConverter(statictics.summaryActivityTime()));
        System.out.println("3) Facebook activity hours: "+statictics.listOfHoursOnFacebook());
        System.out.println("4) Most intensive hour: "+statictics.mostIntensiveHour()[0]+" (activity time: "+Utility.secondToHourMinuteStringConverter(Double.parseDouble(statictics.mostIntensiveHour()[1]))+")" );


    }

}