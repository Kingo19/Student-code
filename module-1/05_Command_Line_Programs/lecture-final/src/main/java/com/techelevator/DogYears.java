package com.techelevator;

import java.util.Scanner;

public class DogYears {


    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);


        // OPTION 1 = Using nextInt + nextLine to get rid of \n characters in stream
//        System.out.println("Enter a human age: ");
//        int humanAge = consoleScanner.nextInt();
//        consoleScanner.nextLine();
//
//        int ageInDogYears = humanAge * 7;
//        System.out.println("You are " + ageInDogYears + " years old in dog years");

        // OPTION 2 - Use Wrapper class
        System.out.println("Enter a human age: ");
        String humanAgeAsString = consoleScanner.nextLine();

        int humanAge = Integer.parseInt(humanAgeAsString);
        int ageInDogYears =  humanAge * 7;
        System.out.println("You are " + ageInDogYears + " years old in dog years");












//        System.out.println("You entered: " + humanAge);
//
//        System.out.println("Please enter your name:");
//        String name = consoleScanner.nextLine();
//
//        System.out.println("Your name is: " + name);



    }

}
