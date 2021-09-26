package com.example.models;

public class Lamp {
    private boolean isTurnedOn = false;
    public static String modalName = "Modal A";

    public void setLampStatus (boolean status){
        this.isTurnedOn = status;
    }
    public boolean getLampStatus(){
        return this.isTurnedOn;
    }

    public static String productDetails (){
        return ("This is " + modalName + " and produced in 2021");
    }

    public String toString() {
        if (this.isTurnedOn) {
            return "The Lamp is ON."+modalName;
        }
        return "The Lamp is OFF." +modalName;
    }



}
