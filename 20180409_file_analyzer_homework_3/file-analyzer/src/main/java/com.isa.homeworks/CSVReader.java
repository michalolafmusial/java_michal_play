package com.isa.homeworks;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CSVReader {

    final String csvFilename = "src/main/resources/activities.csv";
    private ArrayList<Activity> activitiesArrayList;

    public ArrayList<Activity> getActivitiesArrayList() {
        return activitiesArrayList;
    }

    public void setActivitiesArrayList(ArrayList<Activity> activitiesArrayList) {
        this.activitiesArrayList = activitiesArrayList;
    }

    /**
     * Method to parse csv file using final parameter
     * inside loop new "activity" object is created and set and added to ArrayList list
     * then ArrayList "list" is assigned to parameter activitiesArrayList that can be used by other classes
     * @return activitiesArrayList - list of Activity objects from parsed csv file
     * @throws IOException
     */
    public ArrayList<Activity> readCSV() throws IOException {

        ArrayList<Activity> list = new ArrayList<>();

        Reader in = new FileReader(csvFilename);
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            Activity activity = new Activity();

            activity.setStart_time(record.get("start_time"));
            activity.setEnd_time(record.get("end_time"));
            activity.setProductivity(Integer.parseInt(record.get("productivity")));
            activity.setActivity_name(record.get("activity_name"));
            activity.setCategory_name(record.get("category_name"));
            activity.setSpent_time(Integer.parseInt(record.get("spent_time")));
            StringBuffer sBuffer = new StringBuffer(record.get("start_time"));
            activity.setHour(sBuffer.substring(11,13).toString());

            list.add(activity);

        }

        setActivitiesArrayList(list);

        return activitiesArrayList;
    }

}


