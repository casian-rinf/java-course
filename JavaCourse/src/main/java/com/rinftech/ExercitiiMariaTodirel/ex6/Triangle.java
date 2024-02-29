package com.rinftech.ExercitiiMariaTodirel.ex6;

public class Triangle extends Shape{
   private int a;
   private int b;
   private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea(){
        double p=(double) (a+b+c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
