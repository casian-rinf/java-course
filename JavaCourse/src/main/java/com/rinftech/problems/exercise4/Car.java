package com.rinftech.problems.exercise4;

public class Car extends Vehicle{
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    @Override
    public void calculateFuelEfficiency() {
        System.out.println(this.getMake() + " cars have all kinds of fuel depending on their model and fuel type.");

    }
    @Override
    public void calculateDistanceTraveled(int traveledDistance) {
        System.out.println("This " + this.getMake() + " " + this.getModel() + " " + this.getYear() + " has traveled " + traveledDistance +
                " kilometres already!");
    }
    @Override
    public void calculateMaximumSpeed(int speed) {
        System.out.println(this.getMake() + " " + this.getModel() + " " + this.getYear() + " can reach a speed of " + speed
                + " kilometres per hour!");
    }
}
