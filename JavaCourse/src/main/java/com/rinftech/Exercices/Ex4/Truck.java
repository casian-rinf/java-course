package com.rinftech.Exercices.Ex4;

public class Truck extends Vehicle
{
    private double capacity;

    public Truck(String make, String model, int year, String fuelType, double capacity) {
        super(make, model, year, fuelType);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                '}';
    }
}