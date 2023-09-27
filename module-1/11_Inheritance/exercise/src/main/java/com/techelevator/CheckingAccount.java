package com.techelevator;
public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0) {
            if (getBalance() - amountToWithdraw >= -100) {
                if (getBalance() < 0) {

                    amountToWithdraw += 10;
                }
                super.withdraw(amountToWithdraw);
            }
        }
        return getBalance();
    }
}
