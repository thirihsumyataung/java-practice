package com.example.abstraction;

class Circle extends Shapes{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Constructor is called");
        this.color = color;
    }

    @Override
    double area() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle color is " + color + " and its area is " + area();
    }
}