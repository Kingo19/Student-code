package com.techelevator;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private int employeeId;

    public Employee(String firstName, String lastName, int employeeId) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void printStats();

    //DERIVED PROPERTIES (completely optional)
    public String getFullName() {
        return firstName + " " + lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
