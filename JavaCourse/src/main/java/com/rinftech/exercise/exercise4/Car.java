package com.rinftech.exercise.exercise4;

public class Car implements Vehicle {
    String make, model, fuelType;
    int year;

    public Car(String make, String model, String fuelType, int year) {
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
                return "B+";
            default:
                return "C";
        }
    }

    @Override
    public double distanceTravelled() {
        if(year < 2010){
            return 59002;
        }
        else{
            return 20002;
        }
    }

    @Override
    public int maximumSpeed() {
        switch(this.model){
            case "Lamborghini":
                return 230;
            case "Dacia":
                return 80;
            default:
                return 86;
        }
    }

    @Override
    public String toString(){
        return make + " - " + model + " - " + fuelType + " - " + year;
    }
}
