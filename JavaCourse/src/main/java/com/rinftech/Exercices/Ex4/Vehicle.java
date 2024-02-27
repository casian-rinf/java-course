package com.rinftech.Exercices.Ex4;

public class Vehicle
{
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double distance, double fuelConsumed)
    {
        return distance / fuelConsumed;
    }

    public double calculateDistance(double speed, double time)
    {
        return speed * time;
    }

    public double getMaxSpeed()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
