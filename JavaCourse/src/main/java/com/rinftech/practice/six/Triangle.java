package com.rinftech.practice.six;

public class Triangle extends Shape{
    private final double first_length;
    private final double second_length;
    private final double third_length;

    public Triangle(double first_length, double second_length, double third_length) {
        this.first_length = first_length;
        this.second_length = second_length;
        this.third_length = third_length;
    }

    @Override
    double calculateArea() {
        double semiPerimeter = (first_length + second_length + third_length) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - first_length) * (semiPerimeter - second_length) *
                (semiPerimeter - third_length));
    }
}
