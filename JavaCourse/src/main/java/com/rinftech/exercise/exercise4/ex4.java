package com.rinftech.exercise.exercise4;

public class ex4 {
    public static void main(String[] args){
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "ABC1", "benzina", 2011);
        Car car = new Car("Dacia", "Logan", "benzina", 2006);
        Truck truck = new Truck("Scania", "Turbo", "motorina", 2020);
        System.out.println(motorcycle);
        System.out.println(car);
        System.out.println(truck);
    }
}
