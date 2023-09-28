package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        BankAccount checking = new CheckingAccount();
        BankAccount fancyMM = new FancyMMAccount();

        List<BankAccount> accountList = new ArrayList<>();

        checking.printStatement();
        fancyMM.printStatement();




    }



}
