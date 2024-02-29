package com.rinftech.Exercices.Ex3;

public class Ex3
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "Doe");
        System.out.println("Person " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee("Jane","Doe",1234,"JobTitle");
        System.out.println("Employee " + employee.getFirstName() + " " + employee.getLastName());
    }
}
