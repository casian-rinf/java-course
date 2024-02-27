package com.rinftech.exercise.exercise3;

public class Employee extends Person{
    String title;
    int id;

    public Employee(String firstName, String lastName, String title, int id){
        super(firstName, lastName);
        this.title = title;
        this.id = id;
    }

    public int getEmployeeId() {
        return id;
    }

    public String getLastName() {
        return lastName + " - " + title;
    }
}
