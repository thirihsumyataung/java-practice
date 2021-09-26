package com.example.abstraction;

abstract class Shapes {
    String color;

    // abstract methods
    abstract double area();

    public abstract String toString();

    //constructor
    public Shapes(String color) {
        System.out.println("Shape constructor is called");
        this.color = color;
    }

    //Concrete method
    public String getColor() {
        return color;
    }
}

