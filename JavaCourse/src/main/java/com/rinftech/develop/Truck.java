package com.rinftech.develop;

public class Truck extends Vehicle{
    public Truck(String make, String model, Integer year, String fuel_type){
        super(make,model,year,fuel_type);
        }

        @Override
        public int maximumSpeed(){
            return 100;
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
