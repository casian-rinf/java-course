package com.rinftech.practice.shapes;

public class Triangle extends Shape {

    private final float base;
    private final float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return (base * height) / 2;
    }
}
