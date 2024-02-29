package com.rinftech.Exercices.Ex7;

public class Ex7
{
    public static void main(String[] args)
    {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        System.out.println();

        System.out.println("Tiger:");
        tiger.eat();
        tiger.sound();
        System.out.println();

        System.out.println("Panther:");
        panther.eat();
        panther.sound();
        System.out.println();
    }
}
