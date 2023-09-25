package com.techelevator.billpayment;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BillPaymentSystem {

    public static void main(String[] args) {

        ElectricBill eb = new ElectricBill("1234", 100.00);
       // System.out.println("New Bill ->" + eb.getBalance());


        eb.payBill(100);
       // System.out.println("Updated Balance ->" + eb.getBalance());

        NetflixBill nf = new NetflixBill("123456789", 19.99);


        List<Bill> myBills = new ArrayList<>();
        myBills.add(eb);
        myBills.add(nf);

       for (Bill bill : myBills) {

          bill.printDetails();
//
//           if(bill instanceof NetflixBill) {
//               NetflixBill nfb = (NetflixBill) bill;
//               nfb.
//           }

           System.out.println(bill.getAccountNumber() + " has a balance of: $" + bill.getBalance());


           BigDecimal salary = new BigDecimal(100.00);
           salary = salary.add(new BigDecimal(100.00));






       }








    }

}
