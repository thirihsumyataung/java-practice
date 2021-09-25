package com.example.inheritance;

import com.example.models.Bulb;

public class LCDBulb extends Bulb {
    private String lcdBulbType;

    LCDBulb(String bulb){
        this.lcdBulbType = bulb;
    }
    LCDBulb(){
        this.lcdBulbType = "LCD bulb Type";
    }

}
