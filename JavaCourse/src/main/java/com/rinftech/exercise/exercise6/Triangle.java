package com.rinftech.exercise.exercise6;

public class Triangle implements Shape{
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double sp = (side1 + side2 + side3) / 2;
        return Math.sqrt((sp * (sp - side1) * (sp - side2) * (sp - side3)));
    }
}
