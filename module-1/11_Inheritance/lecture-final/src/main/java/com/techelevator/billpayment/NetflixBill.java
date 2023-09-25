package com.techelevator.billpayment;

public class NetflixBill extends Bill {

    private int watchHours;

    public NetflixBill(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Watch HOurs: " + this.watchHours);
    }

    public int getWatchHours() {
        return watchHours;
    }

    public void setWatchHours(int watchHours) {
        this.watchHours = watchHours;
    }

    public void detectFraudBySharingPassword() {
        System.out.println("You need to pay more you are cheating us!!!!!");
    }

}
