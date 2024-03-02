package com.rinftech.problems.exercise4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Supra MKIV", 1996, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 400", 2018, "Unleaded Petrol");
        Truck truck = new Truck("Ford", "F-250", 2021, "Diesel Fuel");

        car.calculateFuelEfficiency();
        motorcycle.calculateFuelEfficiency();
        truck.calculateFuelEfficiency();

        car.calculateDistanceTraveled(137582);
        motorcycle.calculateDistanceTraveled(48973);
        truck.calculateDistanceTraveled(62586);

        car.calculateMaximumSpeed(250);
        motorcycle.calculateMaximumSpeed(196);
        truck.calculateMaximumSpeed(173);
    }
}
