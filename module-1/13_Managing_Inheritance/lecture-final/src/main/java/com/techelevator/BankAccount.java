package com.techelevator;

public abstract class BankAccount {

    private double balance;
    private String accountNumber;

    public abstract void printStatement() ;


    public final boolean shouldWeChargeAnObnoxiousFeeForUsingATM() {
        return true;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
