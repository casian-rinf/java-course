package com.rinftech.Exercices.Ex4;

public class Ex4
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("SomeMake","SomeModel",2000,"SomeFuelType");
        System.out.println(vehicle);

        Car car = new Car("CarMake","CarModel",2002,"CarFuelType",5);
        System.out.println("Car's fuel efficiency: " + car.calculateFuelEfficiency(2.3,2));

        Truck truck = new Truck("TruckMake","TruckModel",2004,"TruckFuelType",2500);
        System.out.println("Truck's max speed: " + truck.getMaxSpeed());

        Motorcycle motorcycle = new Motorcycle("Kawasaki","Ninja H2R",2022,"Diesel",false);
        System.out.println("Motorcycle's distance: " + motorcycle.calculateDistance(25.5,30));
    }
}
