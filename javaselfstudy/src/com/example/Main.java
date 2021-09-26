package com.example;
import com.example.inheritance.LCDLamp;
import com.example.inheritance.LEDLamp;
import com.example.models.Bulb;
import com.example.models.Lamp;
import com.leetcode.TwoSum;
import com.example.generic.Type;
import com.example.generic.TypeCheck;
public class Main {
    public static void main (String[] args){
         //testLamp();
         //testLampType();
            Type<Integer> myObject = new Type<Integer> (1000);
           // System.out.println(myObject.getAnyObject());
       // System.out.println(myObject.typeChecking());
            Type<String> myString = new Type<String>("Hello This is a String.");
            System.out.println(myString.getAnyObject());

    }

}


/*
    public static void testLamp(){
        Lamp.modalName="Modal X";
        Lamp aLamp = new Lamp();
        aLamp.setLampStatus(true);
        Lamp bLamp = new Lamp();
        bLamp.setLampStatus(true);
        aLamp.setLampStatus(false);
        System.out.println(aLamp);
        System.out.println(bLamp);
        System.out.println(Lamp.modalName);
        System.out.println(Lamp.productDetails());

    }
    public static void testLampType(){
        Lamp test1 = new LEDLamp();
        System.out.println(test1);


        Lamp test2 = new LCDLamp();
        System.out.println(test2);

        test1 = test2;
        LCDLamp test3 = (LCDLamp) test1;
        //test2.setType("");
        test3.setType("Light type changed ");
        System.out.println(test3);



    }

    */