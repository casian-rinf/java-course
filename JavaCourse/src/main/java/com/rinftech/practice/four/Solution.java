package com.rinftech.practice.four;

public class Solution {
    public static void main(String[] args) {
        Truck truck = new Truck("Man", "TGX", 2005, "gas");
        double truckFuelEfficiency = truck.calculateFuelEfficiency(100, 12.5);
        System.out.println(truck.getMake() + " " + truck.getModel() + " fuel efficiency = " + truckFuelEfficiency);
        double truckDistanceTravelled = truck.calculateDistanceTraveled(100, 3);
        System.out.println(truck.getMake() + " " + truck.getModel() + " distance travelled = " + truckDistanceTravelled);
        double truckMaxSpeed = truck.calculateMaximumSpeed(20, 1.2);
        System.out.println(truck.getMake() + " " + truck.getModel() + " max speed = " + truckMaxSpeed);

        System.out.println();

        Car car = new Car("BMW", "M5", 2020, "diesel");
        double carFuelEfficiency = car.calculateFuelEfficiency(123.44, 8.5);
        System.out.println(car.getMake() + " " + car.getModel() + " fuel efficiency = " + carFuelEfficiency);
        double carDistanceTravelled = car.calculateDistanceTraveled(170, 2);
        System.out.println(car.getMake() + " " + car.getModel() + " distance travelled = " + carDistanceTravelled);
        double carMaxSpeed = car.calculateMaximumSpeed(50, 0.6);
        System.out.println(car.getMake() + " " + car.getModel() + " max speed = " + carMaxSpeed);

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2015, "gas");
        double motorcycleFuelEfficiency = motorcycle.calculateFuelEfficiency(150, 11.5);
        System.out.println(motorcycle.getMake() + " " + motorcycle.getModel() + " fuel efficiency = " + motorcycleFuelEfficiency);
        double motorcycleDistanceTravelled = motorcycle.calculateDistanceTraveled(90, 5);
        System.out.println(motorcycle.getMake() + " " + motorcycle.getModel() + " distance travelled = " + motorcycleDistanceTravelled);
        double motorcycleMaxSpeed = motorcycle.calculateMaximumSpeed(30, 1.3);
        System.out.println(motorcycle.getMake() + " " + motorcycle.getModel() + " max speed = " + motorcycleMaxSpeed);
    }
}
