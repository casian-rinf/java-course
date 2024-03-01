package com.rinftech.practice.shapes;

public class Rectangle extends Shape {

    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }
}
