package com.rinftech.collections.probl4;

public class Motorcycle extends Vehicle{

    private Double maxSpeed = 180.;

    public Double getMaximumSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "This is a motorcycle: " + super.toString();
    }
}
