package com.rinftech.Exercices.Ex7;

public class Panther extends Animal
{
    @Override
    public void eat() {
        System.out.println("This panther ate some meat");
    }

    @Override
    public void sound() {
        System.out.println("...how does a panther sound like?");
    }
}
