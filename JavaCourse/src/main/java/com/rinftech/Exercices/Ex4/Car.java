package com.rinftech.Exercices.Ex4;

public class Car extends Vehicle
{
    private int seats;

    public Car(String make, String model, int year, String fuelType, int seats) {
        super(make, model, year, fuelType);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return 5.4;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                '}';
    }
}
