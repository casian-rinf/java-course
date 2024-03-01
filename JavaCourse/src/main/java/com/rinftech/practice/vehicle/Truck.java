package com.rinftech.practice.vehicle;

public class Truck extends Vehicle {

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public String calculateFuelEfficiency() {

        if (this.getFuelType().equals("diesel")) {
            return "Fuel efficient for a truck";
        } else {
            return "Not fuel efficient for a truck";
        }
    }

    public String distanceTravelled() {
        if (this.getYear() > 2000) {
            return "not so much";
        } else {
            return "a lot";
        }
    }

    public String maxSpeed() {
        if (this.getYear() > 2000 && this.getFuelType().equals("gas")) {
            return "fast";
        } else {
            return "slow";
        }
    }
}
