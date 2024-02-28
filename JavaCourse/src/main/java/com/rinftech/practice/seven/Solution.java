package com.rinftech.practice.seven;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Tiger());
        animals.add(new Panther());

        for (Animal animal : animals) {
            animal.eat();
            animal.sound();
        }

    }
}
