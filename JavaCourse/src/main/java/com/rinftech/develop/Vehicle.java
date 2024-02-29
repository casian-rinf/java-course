package com.rinftech.develop;

public abstract class Vehicle {
    private String make;
    private String model;
    private Integer year;
    private String fuel_type;

    public Vehicle(String make, String model, Integer year, String fuel_type){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public abstract int maximumSpeed();

    public abstract double calculateFuelEfficiency(double distance, double fuelConsumptionRate);

    public abstract double distanceTraveled(double time, double speed);
}
