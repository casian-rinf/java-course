package com.rinftech.Exercices.Ex6;

public class Ex6
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(10,6,8);

        System.out.println("Circle's area = " + circle.calculateArea());
        System.out.println("Rectangle's area = " + rectangle.calculateArea());
        System.out.println("Triangle's area = " +  triangle.calculateArea());
    }
}
