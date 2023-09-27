package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0) {
            int remainingBalance = getBalance() - amountToWithdraw;
            if (remainingBalance >= -150) {
                if (remainingBalance < 150) {

                    amountToWithdraw += 2;
                }
                super.withdraw(amountToWithdraw);
            }
        }
        return getBalance();
    }
}
