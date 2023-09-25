package com.techelevator.billpayment;

public class Bill {

    private String accountNumber;
    private double balance = 0;

    public Bill(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void payBill(double paymentAmount) {
        if (paymentAmount > 0) {
            this.balance = this.balance - paymentAmount;
        }
    }

    public void printDetails() {
        System.out.println(this.getAccountNumber() + " " + this.balance);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
