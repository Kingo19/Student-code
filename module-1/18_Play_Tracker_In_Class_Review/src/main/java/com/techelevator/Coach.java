package com.techelevator;

public class Coach extends Employee{

    public Coach(String firstName, String lastName, int employeeId) {
        super(firstName, lastName, employeeId);
    }

    @Override
    public void printStats() {
        //don't really print anything here. better to change this later to return the info
    }

    public String toString() {
        return   "Coach: " + this.getFullName();
    }

}
