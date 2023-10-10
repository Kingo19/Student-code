package pkg;

import Files.LogFileWriter;
import Items.CandyStoreItems;

public class CashRegister {
    private LogFileWriter fileWriter = new LogFileWriter();

    private double change;
    private double balance = 0.0;

    public double getBalance() {
        return balance;
    }

    public String addToBalance(double amountToAdd) {
        if (amountToAdd <= 100 && amountToAdd > 0 && amountToAdd + balance <=1000) {
            return "Transaction Successful";
        } else {
            return "Invalid Amount";
        }

    }
    public boolean validateEnoughMoney(CandyStoreItems candyToValidate) {
        if (candyToValidate.getQuantity() * candyToValidate.getPrice() <= balance) {
            return true;
        } else {
            return false;
        }
    }
    public void removeMoney(CandyStoreItems candy) {
        balance -= (candy.getPrice() * candy.getQuantity());
    }

    public String changeStatement() {
        double remaining = balance;
        double[] denominations = new double[]{20.0, 10.0 , 5.0 , 1.0 , 0.25 , 0.10 , 0.5};
        int[] amount = new int[7];

        String[] names = new String[]{"Twenties", "Tens", "Fives" , "Ones", "Quarters", "Dimes","Nickles"};
        String currencyStatements = "";

        for(int i = 0; i < 7 ; i++) {
            amount[i] = (int) (remaining / denominations[i]);
            remaining = remaining - amount[i] * denominations[i];
            if (amount[i] !=0) {
                currencyStatements += ("(" + amount[i] + ") " + names[i] + " ");
            }
        }
        return currencyStatements;
    }

    public void clearRegister(){
        balance = 0;
    }

    public void printChange(){
        fileWriter.writeLogChangeGiven(balance);
    }

}