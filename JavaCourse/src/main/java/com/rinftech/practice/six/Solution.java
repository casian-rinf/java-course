package com.rinftech.practice.six;

public class Solution {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area = " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(10, 13.5);
        System.out.println("Rectangle area = " + rectangle.calculateArea());

        Triangle triangle = new Triangle(13, 14, 16);
        System.out.println("Triangle area = " + triangle.calculateArea());
    }
}
