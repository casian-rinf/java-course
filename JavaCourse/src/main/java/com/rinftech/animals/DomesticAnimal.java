package com.rinftech.animals;

import java.util.Objects;

public class DomesticAnimal extends Animal implements CallablePet {
    private String name;
    private int skillLevel;

    public DomesticAnimal(String race, float weight, String name) {
        super(race, weight);
        this.name = name;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
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

    public void trainSkill(int skillPoints) {
        this.skillLevel = skillLevel + skillPoints;
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