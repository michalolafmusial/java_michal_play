package com.isa.homeworks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Statictics {

    public int counter() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();
        //System.out.println(tablica.get(2).getActivity_name());
        int counter = (int) tablica.stream().count();
        return counter;
    }

    /** Function to create stream from ActivitiesArray, sort it by spent_time,
     * create new collection and get first record that contains lowest spent_time value
     * @return object from ActivitiesArray that contains shortest activity time
     * @throws IOException
     */
    public Activity shortestActivityObject() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();


        // komparator aby porownywac/sortowac obiekty Activity przy uzycie spent_time
        //mozna tak albo tak
        // Comparator<Activity>   byspenttime = (e1, e2 ) -> Integer.compare(e1.getSpent_time(), e2.getSpent_time());
        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // posortowanie i wydrukowanie posortowanej kolekcji
        //tablica.stream().sorted(byspenttime).forEach(System.out::println);

        // act - obiekt z tablicy ktory zawiera najmniejsza dlugosc spent_time
        //tablica - stream - sortowanie po komparatorze - tworzenie nowej kolekcji - wziecie nowego wiersza
        Activity act = tablica.stream().sorted(byspenttime).collect(Collectors.toList()).get(0);

        //
        return act;
    }

    /** Function to create stream from ActivitiesArray, sort it in reverse orderby spent_time,
     * create new collection and get first record that contains lowest spent_time value
     * @return object from ActivitiesArray that contains shortest activity time
     * @throws IOException
     */

    public Activity longestActivityObject() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();


        // komparator aby porownywac/sortowac obiekty Activity przy uzycie spent_time
        //mozna tak albo tak
        // Comparator<Activity>   byspenttime = (e1, e2 ) -> Integer.compare(e1.getSpent_time(), e2.getSpent_time());
        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // posortowanie i wydrukowanie posortowanej kolekcji
        //tablica.stream().sorted(byspenttime).forEach(System.out::println);

        // act - obiekt z tablicy ktory zawiera najmniejsza dlugosc spent_time
        //tablica - stream - sortowanie po komparatorze - tworzenie nowej kolekcji - wziecie nowego wiersza
        Activity act = tablica.stream().sorted(byspenttime.reversed()).collect(Collectors.toList()).get(0);

        return act;
    }

    public double averageActivityTime() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);

        // tablica - stream - mapowanie aby wziac tylko wartosc spent time - zmapowanie ich do integera - wziecie sredniej z nich
        OptionalDouble average = tablica.stream().map(Activity::getSpent_time).mapToInt(Activity -> Activity).average();

        return average.getAsDouble();
    }


    public double summaryActivityTime() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);

        // tablica - stream - mapowanie aby wziac tylko wartosc spent time - zmapowanie ich do integera - wziecie sredniej z nich
        OptionalDouble average = OptionalDouble.of(tablica.stream().map(Activity::getSpent_time).mapToInt(Activity -> Activity).sum());
        return average.getAsDouble();
    }


}
