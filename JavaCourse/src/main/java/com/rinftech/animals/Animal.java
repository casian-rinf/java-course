package com.rinftech.animals;

import java.util.Objects;

public class Animal {

    private String race;
    private float weight;

    public Animal(String race, float weight) {
        this.race = race;
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Float.compare(getWeight(), animal.getWeight()) == 0 && Objects.equals(getRace(), animal.getRace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRace(), getWeight());
    }
}
