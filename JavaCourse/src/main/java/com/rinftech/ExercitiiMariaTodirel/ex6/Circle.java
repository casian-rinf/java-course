package com.rinftech.ExercitiiMariaTodirel.ex6;

public class Circle extends Shape{
    final double PI = Math.PI;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * (radius^2);
    }
}
