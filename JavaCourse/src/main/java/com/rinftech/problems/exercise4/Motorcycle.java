package com.rinftech.problems.exercise4;

public class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println(this.getMake() + " motorcycles have all kinds of fuel depending on their model and fuel type.");

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
