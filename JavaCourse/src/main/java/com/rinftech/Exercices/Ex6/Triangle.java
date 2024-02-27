package com.rinftech.Exercices.Ex6;

public class Triangle extends Shape
{
    private double l1, l2, l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    @Override
    public double calculateArea() {
        double s = this.l1 + this.l2 + this.l3;
        s = s/2;

        return Math.sqrt(s * (s - this.l1) * (s - this.l2) * (s - this.l3));
    }
}
