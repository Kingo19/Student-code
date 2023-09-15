package com.techelevator;

public class LoopsAndArrays {

    public static void main(String[] args) {

        int[] numbers = new int[50];


        // populate with some data programmatically
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = i+5;
        }

        //loop backwards and print out all the numbers
        for (int i = numbers.length-1; i>=0; i-- ) {
       //     System.out.println(numbers[i]);
        }

        for(int i = 0; i<numbers.length; i++) {
            //check to see if the value at numbers[i] is even
            if (numbers[i] % 2 == 0) {
                //we found an even number because numbers[i] / 2 has no remainder
  //              System.out.println(numbers[i] + " is even");
            }
            else {
   //             System.out.println(numbers[i] + " is odd");
            }

        }


        //SEARCH FOR ALL EVEN NUMBERS AND PUT RESULTS IN A NEW ARRAY OF ONLY EVENS


        int[] evens = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                //we found an even number - put that even number in the evens array
                evens[i] = numbers[i];
            }

        }


        //WHILE
        int num = 0;

        while (num <10) {
            System.out.println(num);
            num++;
        }













        System.out.println("Goodbye!");






    }



}
