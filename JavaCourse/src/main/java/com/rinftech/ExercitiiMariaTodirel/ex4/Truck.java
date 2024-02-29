package com.rinftech.ExercitiiMariaTodirel.ex4;

public class Truck extends Vehicle {
    private int maxCargoWeight;

    public Truck(String make, String model, int year, String fuelType, int maxCargoWeight) {
        super(make, model, year, fuelType);
        this.maxCargoWeight = maxCargoWeight;
    }
    @Override
    public double calculateFuelEfficeincy(){
        return 7.5;
    }
    @Override
    public double calculateDistanceTraveled(double fuelConsumed){
        return fuelConsumed*calculateFuelEfficeincy();
    }
    @Override
    public int calculateMaxSpeed(){
        return 80;
    }


}
