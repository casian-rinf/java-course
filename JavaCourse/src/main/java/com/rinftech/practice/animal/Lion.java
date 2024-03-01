package com.rinftech.practice.animal;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}
