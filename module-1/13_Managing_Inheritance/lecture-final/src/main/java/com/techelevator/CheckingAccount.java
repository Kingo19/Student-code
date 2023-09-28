package com.techelevator;

public class CheckingAccount extends BankAccount{

    private int startingCheckNumber;


    public void writeCheck(double amt, String payee) {
        System.out.println(amt + " was paid to: " + payee );
    }


    public int getStartingCheckNumber() {
        return startingCheckNumber;
    }

    public void setStartingCheckNumber(int startingCheckNumber) {
        this.startingCheckNumber = startingCheckNumber;
    }

    @Override
    public void printStatement() {
        System.out.println("Checking Account Statement stuff");
    }
}
