package com.rinftech.practice.animal;

public class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther eats meat and birds.");
    }

    @Override
    public void sound() {
        System.out.println("The panther meows.");
    }
}
