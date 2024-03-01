package com.rinftech.develop;
//3 problem
public class Person {
    private String firstName;
    private String lastName;

    //constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //get
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void calculateFuelEfficiency(){

    }

    public int distanceTraveled(int time, int speed){
        return time*speed;
    }

    public int maximumSpeed(){
        return 0;
    }
}
