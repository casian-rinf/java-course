package com.rinftech.exercise.exercise4;

public class Motorcycle implements Vehicle {
    String make, model, fuelType;
    int year;

    public Motorcycle(String make, String model, String fuelType, int year) {
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
            return 59001;
        }
        else{
            return 20001;
        }
    }

    @Override
    public int maximumSpeed() {
        switch(this.model){
            case "Harley Davidson":
                return 110;
            default:
                return 76;
        }
    }

    @Override
    public String toString(){
        return make + " - " + model + " - " + fuelType + " - " + year;
    }
}
