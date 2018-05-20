package com.example.juanpedrog.laboratorio58;

public class Item {
    String number,date,duration,type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item(String number, String date, String duration, String type) {

        this.number = number;
        this.date = date;
        this.duration = duration;
        this.type = type;
    }
}
