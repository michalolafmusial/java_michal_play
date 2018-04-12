package com.isa.homeworks;

public class Activity {

    private String start_time;
    private String end_time;
    private int productivity;
    private String activity_name;
    private String category_name;
    private int spent_time;

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getSpent_time() {
        return spent_time;
    }

    public void setSpent_time(int spent_time) {
        this.spent_time = spent_time;
    }

    public String toString() {
        return "start_time: " + this.start_time + "| end_time: " + this.end_time + "| productivity: " +this.productivity + "| activity_name: " + this.activity_name+"| category_name "+this.category_name+"| spent_time "+this.spent_time;
    }
}