package com.example.inheritance;

import com.example.models.Bulb;

public class LEDBulb extends Bulb {
    private String ledBulbType;

    LEDBulb(String bulb){
        this.ledBulbType = bulb;
    }
    LEDBulb(){
        this.ledBulbType = "LCD bulb Type";
    }
}
