package com.techelevator;

import java.util.Scanner;


public class AreWeThereYet {


    public static void main(String[] args) {

        //Create a scanner so we can read input from the user
        Scanner myScanner = new Scanner(System.in);


     //   int num = Integer.parseInt("45");



        boolean driving = true;
        while(driving) {


            System.out.println("Bart: Are we there yet? (Y)es or (N)o");
            String answer = myScanner.nextLine();

            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
                System.out.println("Bart: Cowabuga!");
                driving = false;
            }
            else {
                System.out.println("Bart: Eat My Shorts!");
            }


        }
        System.out.println("Homer: Doh!");















    }

}
