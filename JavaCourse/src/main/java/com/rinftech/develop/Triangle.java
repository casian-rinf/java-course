package com.rinftech.develop;

public class Triangle extends Shape{

    private int hight;
    private int base;
    public Triangle(int hight, int base){
        this.hight  =hight;
        this.base = base;
    }

    @Override
    public double calculateArea(){
        return (this.hight*this.base)/2;
    }
}
