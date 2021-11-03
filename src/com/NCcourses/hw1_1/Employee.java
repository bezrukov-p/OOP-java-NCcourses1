package com.NCcourses.hw1_1;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary += salary/percent;
        return salary;
    }

    public String toString(){
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && getSalary() == employee.getSalary()
                && Objects.equals(getFirstName(), employee.getFirstName())
                && Objects.equals(getLastName(), employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getFirstName(), getLastName(), getSalary());
    }
}
