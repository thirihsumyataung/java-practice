package com.example.abstraction;

class Triangle extends Shapes{
    int base ;
    int height ;

    public Triangle(String color, int b , int h) {
        super(color);
        System.out.println("Triangle Constructor is called. ");
        this.base = b ;
        this.height = h ;
    }

    @Override
    double area() {
        return ( base * height )/2;
    }

    @Override
    public String toString() {
        return "Triangle color is : " + color + " and its area is : " + area();
    }
}
