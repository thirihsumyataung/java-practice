package com.example.abstraction;

class Rectangle extends Shapes{
    int length ;
    int width ;

    public Rectangle(String color, int length , int width) {
        super(color);
        System.out.println("Rectangle Constructor is called.");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width ;
    }

    @Override
    public String toString() {
        return "Rectangle Color is : " + color + " and area is : " + area();
    }
}
