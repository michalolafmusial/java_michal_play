package com.isa.homeworks;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

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

    public String listOfHoursOnFacebook () throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        //Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);




        // tablica - stream - mapowanie aby wziac tylko wartosc spent time - zmapowanie ich do integera - wziecie sredniej z nich
        String collect = tablica.stream()
                .filter(Activity -> "facebook.com".equals(Activity.getActivity_name()))
                .map(Activity::getStart_time)
                .map(startTime -> LocalDateTime.parse(startTime, formatter))
                .map(startTime -> "" + startTime.getHour())
                .distinct()
                //.map(Integer::toString)
                .collect(Collectors.joining(","));
        //System.out.println(collect);
        return collect;
    }

    public double mostIntensiveHour() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        System.out.println("most intensive hour");

        //Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        // tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);

        // tablica - stream - mapowanie aby wziac tylko wartosc spent time - zmapowanie ich do integera - wziecie sredniej z nich

        Map<String, Long> map = tablica.stream().collect(Collectors.groupingBy(Activity::getHour, counting()));


        System.out.println(map);




        return 2;
    }


}
