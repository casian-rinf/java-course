package com.rinftech.ExercitiiMariaTodirel.ex4;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
        super(make, model, year, fuelType);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public double calculateFuelEfficeincy(){
        return 8.5;
    }
    @Override
    public double calculateDistanceTraveled(double fuelConsumed){
        return fuelConsumed*calculateFuelEfficeincy();
    }
    @Override
    public int calculateMaxSpeed(){
        return 120;
    }
}
