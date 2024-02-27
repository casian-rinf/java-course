package com.rinftech.collections.probl4;

public abstract class Vehicle {
    private String make;

    private String model;

    private Integer year;

    private String fuelType;

    public Double calculateFuelEfficiency(Double distance, Double fuelConsumed) {
        return distance/fuelConsumed;
    }

    public Double calculateDistanceTraveled(Double time, Double speed) {
        return time * speed;
    }

    public abstract Double getMaximumSpeed();

    @Override
    public String toString() {
        return "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
