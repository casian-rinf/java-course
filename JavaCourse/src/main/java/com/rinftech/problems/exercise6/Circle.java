package com.rinftech.problems.exercise6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
