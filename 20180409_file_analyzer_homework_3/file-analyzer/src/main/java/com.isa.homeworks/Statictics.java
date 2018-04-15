package com.isa.homeworks;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class Statictics {

    /**
     * Method to count the number of elements in the ArrayList using streams
     *
     * @return number of elements in ArrayList
     * @throws IOException
     */
    public int counter() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();
        int counter = (int) tablica.stream().count();
        return counter;
    }

    /**
     * Method to create stream from ActivitiesArray,
     * sort it by spent_time and get first record that contains lowest spent_time value
     * There is comparator byspenttime created that is required to compare and sort by spentTime values
     * Comparator can by created using below syntax as well
     * Comparator<Activity>   byspenttime = (e1, e2 ) -> Integer.compare(e1.getSpent_time(), e2.getSpent_time());
     * <p>
     * There are nultiple elements in ArrayList with lowest spentTime, but we are interested in the value only
     * Stream path: ArrayList -> stream -> sort -> create new collection -> get first record
     *
     * @return object act from ActivitiesArray that contains shortest activity time
     * @throws IOException
     */
    public Activity shortestActivityObject() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        Activity act = tablica.stream().sorted(byspenttime).collect(Collectors.toList()).get(0);

        return act;
    }

    /**
     * Method to create stream from ActivitiesArray, sort it in reverse order by spent_time
     * (using Compataror created in the same way like in method shortestActivityObject
     * create new collection and get first record that contains lowest spent_time value
     * <p>
     * All logic is the same like shortestActivityObject, except reverse sorting method
     *
     * @return object fact rom ActivitiesArray that contains shortest activity time
     * @throws IOException
     */
    public Activity longestActivityObject() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        Comparator<Activity> byspenttime = Comparator.comparingInt(Activity::getSpent_time);

        Activity act = tablica.stream().sorted(byspenttime.reversed()).collect(Collectors.toList()).get(0);

        return act;
    }

    /**
     * Method to get average value for one of object feature
     * tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);
     * Logic: create stream -> map to dusplay only the values where we need to calculate average value ->
     * map to integer to allow average calculation -> use average function
     * <p>
     * Hint: to display mapped values:
     * tablica.stream().map(Activity::getSpent_time).forEach(System.out::println);
     *
     * @return
     * @throws IOException
     */
    public double averageActivityTime() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        OptionalDouble average = tablica.stream().map(Activity::getSpent_time).mapToInt(Activity -> Activity).average();

        return average.getAsDouble();
    }

    /**
     * Method to get summary value for one of object feature
     * <p>
     * Logic: create stream -> map to dusplay only the values where we need to calculate average value ->
     * map to integer to allow average calculation -> use sum function
     *
     * @return
     * @throws IOException
     */
    public double summaryActivityTime() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        OptionalDouble average = OptionalDouble.of(tablica.stream().map(Activity::getSpent_time).mapToInt(Activity -> Activity).sum());
        return average.getAsDouble();
    }

    /**
     * Method to list the hours (part of String) from one of Activity feature
     * Logic for stream:
     * filter for "facebook.com" entries only -> map tp Start time -->
     * --> parse start time to the format used in input file, i.e. yyyy-MM-dd HH:mm -->
     * map startTime value to user friendli string --> get distinct values -->
     * create collection with values joined by ","
     *
     * @return
     * @throws IOException
     */
    public String listOfHoursOnFacebook() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String collect = tablica.stream()
                .filter(Activity -> "facebook.com".equals(Activity.getActivity_name()))
                .map(Activity::getStart_time)
                .map(startTime -> LocalDateTime.parse(startTime, formatter))
                .map(startTime -> "" + startTime.getHour())
                .distinct()
                .collect(Collectors.joining(","));
        return collect;
    }

    /**
     * Method to group by SQL type stream. To do grouping, new Map is required
     * Aim is to get one column (hour here) and sum entries for other values for this group, e.g.
     * [hour] [value]
     * 23      9
     * 22      11
     * 19      10
     * 23      7
     * 19      45
     * output
     * 19      55
     * 22      11
     * 23      16
     *
     * new map to keep key and value is created
     * Stream logic:
     * group by Activity::getHour and use collectors for summing
     *
     * returnTable [x] calculates highest value for summing
     *
     * @return plain array with two elements - key and value for gruoped entry
     * @throws IOException
     */
    public String[] mostIntensiveHour() throws IOException {

        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
        ArrayList<Activity> tablica = csvReader.getActivitiesArrayList();

        Map<String, Integer> map =

                tablica.stream()
                        .collect(Collectors.groupingBy(Activity::getHour, Collectors.summingInt(Activity::getSpent_time)));
        String[] returnTable = new String[2];

        returnTable[0] = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        returnTable[1] = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getValue().toString();

        return returnTable;
    }


}
