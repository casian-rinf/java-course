package com.rinftech.animals;

public class WildAnimal extends Animal {
    private String origin;

    public WildAnimal(String race, float weight, String origin) {
        super(race, weight);
        this.origin = origin;
    }
}
