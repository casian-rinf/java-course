package com.rinftech.practice.vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, int year, String fuelType) {
        if (fuelType.equals("diesel")) {
            throw new IllegalArgumentException("Motorcycles cannot run on diesel");
        } else {
            this.setMake(make);
            this.setModel(model);
            this.setYear(year);
            this.setFuelType(fuelType);
        }
    }

    public String calculateFuelEfficiency() {

        if (this.getYear() > 2010) {
            return "Fuel efficient for a motorcycle";
        } else {
            return "Not fuel efficient for a motorcycle";
        }
    }

    public String distanceTravelled() {
        if (this.getYear() > 2010) {
            return "not so much";
        } else {
            return "a lot";
        }
    }

    public String maxSpeed() {
        if (this.getYear() > 2020) {
            return "fast";
        } else {
            return "slow";
        }
    }
}
