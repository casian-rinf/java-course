package com.rinftech.develop;


public class Employee extends Person {

    private Integer empoyeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, Integer empoyeeId , String jobTitle) {
        super(firstName, lastName);
        this.empoyeeId = empoyeeId;
        this.jobTitle = jobTitle;
    }
    //get
    public Integer getEmpoyeeId() {
        return empoyeeId;
    }

    @Override
    public String getLastName(){
        return super.getLastName()+","+jobTitle;
    }
}

