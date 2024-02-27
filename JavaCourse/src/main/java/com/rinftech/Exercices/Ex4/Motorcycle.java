package com.rinftech.Exercices.Ex4;

public class Motorcycle extends Vehicle
{
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateDistance(double speed, double time) {
        return 27.5;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}';
    }
}