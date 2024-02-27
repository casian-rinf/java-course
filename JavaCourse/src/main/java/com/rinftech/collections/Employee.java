package com.rinftech.collections;

public class Employee extends Person {
    private Integer employeeId;

    private String title;


    public Employee() {
    }

    public Employee(Integer employeeId, String title) {
        this.employeeId = employeeId;
        this.title = title;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " is " + this.getTitle();
    }
}
