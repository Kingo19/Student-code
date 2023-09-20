package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FizzBuzz {

    private static Scanner scanner = new Scanner(System.in);
    private static final int  EXIT = 3;
    private static final int  CALCULATE = 1;
    private static final int PRINT = 2;


    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();

        //DECLARE AND INSTANTIATE A HASHMAP TO HOLD OUR CALCULATED RESULTS
        Map<Integer, String> fizzBuzzMap = new HashMap<>();


        while (true) {

            // display a simple menu
            int choice = fb.printMenu();

            //do something based on user choice
            if (choice == CALCULATE) {
                // ask user to enter a number
                System.out.println("Please enter a number to convert:");
                int number = scanner.nextInt();
                scanner.nextLine();

                // calculate fizzbuzz and add it to the map
                if (number % 3 == 0 && number % 5 == 0) {
                    // fizzbuzz
                    fizzBuzzMap.put(number, "fizzbuzz");
                }
                else if (number % 3 == 0) {
                    fizzBuzzMap.put(number, "fizz");
                }
                else if (number % 5 == 0) {
                    fizzBuzzMap.put(number, "buzz");
                }
                else {
                    //we use the number
                    fizzBuzzMap.put(number, String.valueOf(number));   // String.valueOf --> converts int into a String
                }


            }
            else if (choice == PRINT) {
                //iterate (loop) through the map and print values

                //OPTION 1 Using keySet
//                Set<Integer> keys = fizzBuzzMap.keySet();
//
//                // loop through and use each key in the set to open and print the value
//                for (Integer myCurrentKey : keys) {
//                    System.out.println(myCurrentKey +  " is " + fizzBuzzMap.get(myCurrentKey));
//                }


                //OPTION 2 Using Map.Entry
                for (Map.Entry<Integer, String> row : fizzBuzzMap.entrySet()) {
                    System.out.println(row.getKey() +  " is " + row.getValue());
                }

            }
            else if (choice == EXIT) {     //EXIT
                break;       // System.exit(0);
            }
            else {
                System.out.println("Not a valid option. Please try again");
            }

        }
        System.out.println("Goodbye!");
    }

    /**
     *   Prints a menu to the console
     */
    private int printMenu() {

        System.out.println("*********  Java Green Menu *********");
        System.out.println("1. Calculate FizzBuzz");   // ask user for number and convert into fizzbuzz and store in  map
        System.out.println("2. Print FizzBuzz");       // print all the values in the map
        System.out.println("3. Exit");
        System.out.println("--> Please select a choice");

        String choice = scanner.nextLine();
        return Integer.parseInt(choice);

    }


}
