package com.rinftech.practice.animal;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats meat and humans");
    }

    @Override
    public void sound() {
        System.out.println("The tiger growls.");

    }
}
