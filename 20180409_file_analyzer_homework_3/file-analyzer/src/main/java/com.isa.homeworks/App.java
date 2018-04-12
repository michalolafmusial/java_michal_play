package com.isa.homeworks;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
        //  InputStream activitiesStream = App.class.getClassLoader().getResourceAsStream("activities.csv");
        //  Scanner scanner = new Scanner(activitiesStream).useDelimiter("\n");
        //  while (scanner.hasNext()) {
        //      System.out.println(scanner.next());
        //  }
        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        //System.out.println(csvReader.getActivitiesArrayList().get(2).getEnd_time());
        //System.out.println(csvReader.readCSV().get(1).getEnd_time());

        Statictics statictics = new Statictics();
        System.out.println("Counter: "+statictics.counter());
        System.out.println("Shortest activity record. Name: "+statictics.shortestActivityObject().getActivity_name()+" time_spent: "+statictics.shortestActivityObject().getSpent_time());
        System.out.println("Longest  activity record. Name: "+statictics.longestActivityObject().getActivity_name()+" time_spent: "+statictics.longestActivityObject().getSpent_time());
        System.out.println("Average activity time: "+statictics.averageActivityTime());
    }

}