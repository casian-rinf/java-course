package com.rinftech.practice.shapes;

public class Circle extends Shape {

    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}
