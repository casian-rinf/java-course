package com.rinftech.collections.probl7;

public class Panther extends Animal{
    @Override
    public void eat() {
        System.out.println("The panther is a carnivore, he also eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Panther: Miau!");
    }
}
