package com.company;

//import java.json
import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //tworzenie prostego jsona
        System.out.println("JSON import sample");
        JSONObject obj = new JSONObject();

        obj.put("name", "Michal");
        obj.put("last name", "Musial");



        System.out.println(obj);

    }
}
