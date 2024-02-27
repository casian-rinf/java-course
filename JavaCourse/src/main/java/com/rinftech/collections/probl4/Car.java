package com.rinftech.collections.probl4;

public class Car extends Vehicle{
    private Double maxSpeed = 160.;

    public Double getMaximumSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "This is a car: " + super.toString();
    }
}
