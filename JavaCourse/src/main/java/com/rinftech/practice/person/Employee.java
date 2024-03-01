package com.rinftech.practice.person;

public class Employee extends Person {

    private int employeeId;
    private String jobTitle;

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + jobTitle;
    }

}

