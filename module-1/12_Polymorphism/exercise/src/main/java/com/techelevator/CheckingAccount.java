package com.techelevator;

public class CheckingAccount extends BankAccount {
    public static final int MINIMUM_BALANCE = -100;
    public static final int OVERDRAFT_FEE = 10;

    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public CheckingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0 && (getBalance() - amountToWithdraw > MINIMUM_BALANCE)) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 0) {
                super.withdraw(OVERDRAFT_FEE);
            }
        }
        return getBalance();
    }
}
