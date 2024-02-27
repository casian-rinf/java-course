package com.rinftech.exercise.exercise3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Person person = new Person("Rares", "Macovei");
        Employee employee = new Employee("Alta", "Persoana", "Programator Junior", 1);
        System.out.println(person.getLastName());
        System.out.println(employee.getEmployeeId() + ". " + employee.getFirstName() + " " + employee.getLastName());
    }
}
