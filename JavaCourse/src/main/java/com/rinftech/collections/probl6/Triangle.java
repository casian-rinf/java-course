package com.rinftech.collections.probl6;

public class Triangle extends Shape{
    private Double base;

    private Double height;

    @Override
    public Double calculateArea() {
        return getBase() * getHeight() / 2;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }
}
