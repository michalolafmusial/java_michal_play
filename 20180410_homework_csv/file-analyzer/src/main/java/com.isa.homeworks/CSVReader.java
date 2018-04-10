package com.isa.homeworks;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CSVReader {

    String start_time;
    String end_time;
    String productivity;
    String activity_name;
    String category_name;
    String spent_time;

    public ArrayList<String> readCSV() throws IOException {
        System.out.println("a");

        ArrayList<String> list = new ArrayList<>();

        Reader in = new FileReader("c:/Praca/git/projekty_michal_musial/20180410_homework_csv/file-analyzer/src/main/resources/activities.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            Activity activity = new Activity();
            activity.setSpent_time(record.get("start_time"));
            activity.setEnd_time(record.get("end_time"));
        }
        return list;
    }

}
