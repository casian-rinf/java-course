package com.rinftech.exercise.exercise6;

public class ex6 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
