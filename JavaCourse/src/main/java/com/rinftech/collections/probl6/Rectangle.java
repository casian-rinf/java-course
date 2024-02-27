package com.rinftech.collections.probl6;

public class Rectangle extends Shape{
    private Double length;

    private Double height;
    @Override
    public Double calculateArea() {
        return getHeight() * getLength();
    }

    public Double getLength() {
        return length;
    }

    public Double getHeight() {
        return height;
    }
}
