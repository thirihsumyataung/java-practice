package com.example.inheritance;

import com.example.models.Lamp;

public class LEDLamp extends Lamp {
    private String type="LED Light";


    public String toString(){

        return "LEDLamp has " + type + " type." + productDetails() ;
    }

}
