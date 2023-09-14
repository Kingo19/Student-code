package com.techelevator;

public class BasicLoopsExample {


    public static void main(String[] args) {

        //BE ABLE TO LOOP FORWARD 10 TIMES ONE NUMBER AT A TIME
        for (int i=1; i<=10; i++ ) {

          //  System.out.println(i);

        }

        //BE ABLE TO LOOP BACKWARDS 10 TIMES ONE NUMBER AT A TIME
        for (int i=10; i>0; i-- ) {

         //   System.out.println(i);

        }


        //BE ABLE TO LOOP FORWARD PRINT EVERY 5
        for (int i=0; i<100; i+=5 ) {

     //         System.out.println(i);

        }

        //BE ABLE TO LOOP FORWARD PRINT EVERY 5
        for (int i=0; i<100; i+=5 ) {

            System.out.println(i);
            if (i == 50) {
                break;
            }

        }





    }
}
