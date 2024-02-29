package com.rinftech.ExercitiiMariaTodirel.ex4;

public class Motorcycle extends Vehicle {
    private boolean hasAttach;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasAttach) {
        super(make, model, year, fuelType);
        this.hasAttach = hasAttach;
    }
    @Override
    public double calculateFuelEfficeincy(){
        return 9.5;
    }
    @Override
    public double calculateDistanceTraveled(double fuelConsumed){
        return fuelConsumed*calculateFuelEfficeincy();
    }
    @Override
    public int calculateMaxSpeed(){
        return 200;
    }
}
