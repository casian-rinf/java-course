package com.rinftech.collections.probl6;

public class Circle extends Shape{
    private final Double PI = 3.14;

    private Double diameter;

    @Override
    public Double calculateArea() {
        Double halfDiameter = getDiameter() / 2;
        return PI * halfDiameter * halfDiameter;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}
