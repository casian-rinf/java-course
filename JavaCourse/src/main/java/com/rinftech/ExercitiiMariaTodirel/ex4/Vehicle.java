package com.rinftech.ExercitiiMariaTodirel.ex4;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public double calculateFuelEfficeincy(){
        return 0.0;
    }
    public double calculateDistanceTraveled(double fuelConsumed){
        return 0.0;
    }
    public int calculateMaxSpeed(){
        return 0;
    }

}
