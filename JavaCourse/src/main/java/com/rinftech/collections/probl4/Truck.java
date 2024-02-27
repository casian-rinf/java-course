package com.rinftech.collections.probl4;

public class Truck extends Vehicle{
    private Double maxSpeed = 120.;

    public Double getMaximumSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "This is a truck: " + super.toString();
    }
}
