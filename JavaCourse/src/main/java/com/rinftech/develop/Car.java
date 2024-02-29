package com.rinftech.develop;

public class Car extends Vehicle{
    public Car(String make, String model, Integer year, String fuel_type){
        super(make,model,year,fuel_type);
        }

        @Override
        public int maximumSpeed(){
            return 120;
        }

        @Override
        public double calculateFuelEfficiency(double distance, double fuelConsumptionRate) {
            return distance / fuelConsumptionRate;
        }

        @Override
        public double distanceTraveled(double time, double speed){
            return time*speed;
        }

}
