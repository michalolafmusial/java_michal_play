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
        System.out.println(csvReader);
    }
}
