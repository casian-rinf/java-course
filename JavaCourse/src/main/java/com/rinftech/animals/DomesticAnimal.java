package com.rinftech.animals;


import java.util.Objects;

public class DomesticAnimal extends Animal implements CallablePet {
    private String name;

    public DomesticAnimal(String race, float weight, String name) {
        super(race, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callPet() {
        System.out.println("Call domestic animal by name - " + this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomesticAnimal)) return false;
        if (!super.equals(o)) return false;
        DomesticAnimal that = (DomesticAnimal) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }
}