package com.rinftech.ExercitiiMariaTodirel.ex3;

import com.rinftech.ExercitiiMariaTodirel.ex3.Person;

public class Employee extends Person {
    private  int id;
    private String jobTitle;

    public Employee(String firstName, String lastName, int id, String jobTitle) {
        super(firstName, lastName);
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId(){
        return id;
    }
    @Override
    public String getLastName(){
        return super.getLastName()+", "+ jobTitle;
    }

}
