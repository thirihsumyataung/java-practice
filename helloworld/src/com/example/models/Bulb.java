package com.example.models;

public class Bulb  {
    private String bulbType = "A bulb";

    public void setBulbType(String type){
        this.bulbType = type;
    }

    public String getBulbType(){
        return this.bulbType;
    }
    public String toString(){
        return "This lamp bulb type is: " + this.bulbType;
    }
}
