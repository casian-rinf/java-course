package com.rinftech.develop;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return this.length*this.width;
    }
}
