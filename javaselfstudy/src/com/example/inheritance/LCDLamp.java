package com.example.inheritance;

import com.example.models.Lamp;

public class LCDLamp extends Lamp {
    private String type = "LCD Bulb";

    public void setType(String aType){
        this.type = aType;
    }

    public String getType(){
        return this.type;
    }
    public String toString(){
        return "LCD lamp is " + type +" type.";
     }

}
