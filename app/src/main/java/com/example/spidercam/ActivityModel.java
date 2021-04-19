package com.example.spidercam;

public class ActivityModel {
    String date,message;

    ActivityModel(){

    }

    public ActivityModel(String date, String message) {
        this.date = date;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
