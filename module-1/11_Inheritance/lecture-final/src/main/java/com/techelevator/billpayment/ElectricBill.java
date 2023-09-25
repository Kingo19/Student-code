package com.techelevator.billpayment;

public class ElectricBill extends Bill {

    private int wattsUsed;

    public ElectricBill(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void payBill(double paymentAmount) {
        double obnoxiousFeeToAdd = 10.00;

        super.payBill(paymentAmount - obnoxiousFeeToAdd);

    }


    public void printDetails() {
        super.printDetails();
        System.out.println("WattsUsed: " + this.wattsUsed);
    }


    public int getWattsUsed() {
        return wattsUsed;
    }

    public void setWattsUsed(int wattsUsed) {
        this.wattsUsed = wattsUsed;
    }
}
