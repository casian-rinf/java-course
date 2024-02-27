package com.rinftech.exercise.exercise4;

public class Truck implements Vehicle {
    String make, model, fuelType;
    int year;

    public Truck(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
    }

    @Override
    public String fuelEfficiency() {
        switch(this.fuelType){
            case "benzina":
                return "A+";
            case "motorina":
                return "B";
            default:
                return "D";
        }
    }

    @Override
    public double distanceTravelled() {
        if(year < 2010){
            return 59000;
        }
        else{
            return 20000;
        }
    }

    @Override
    public int maximumSpeed() {
        switch(this.model){
            case "Volvo":
                return 110;
            case "Mercedes":
                return 130;
            case "Iveco":
                return 75;
            default:
                return 76;
        }
    }

    @Override
    public String toString(){
        return make + " - " + model + " - " + fuelType + " - " + year;
    }
}
