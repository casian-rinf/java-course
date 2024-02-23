package com.rinftech.animals;

import java.util.Objects;

public class GoldenRetriever extends DomesticAnimal {

    private String color;

    public GoldenRetriever(String race, float weight, String name, String color) {
        super(race, weight, name);
        this.color = color;
    }

    @Override
    public void callPet() {
        System.out.println("Come here boy - " + this.getName());
    }

    public void petDog() {
        System.out.println("Pet this dog indefinitely");
    }

    public void petDog(int minutes) {
        System.out.println("Pet this dog for " + minutes + "minutes");
    }

    public void petDog(boolean isSafe) {
        if (isSafe) {
            System.out.println("You can pet this dog");
        } else {
            System.out.println("Do not pet this dog");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoldenRetriever)) return false;
        if (!super.equals(o)) return false;
        GoldenRetriever that = (GoldenRetriever) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "GoldenRetriever{" +
                "race='" + this.getRace() + '\'' +
                "weight='" + this.getWeight() + '\'' +
                "name='" + this.getName() + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
