package com.rinftech.problems.exercise6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle square = new Rectangle(8, 8);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + square.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
