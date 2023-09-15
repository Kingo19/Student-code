package com.techelevator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a series of numbers separated by commas and then hit <enter>:");
        String numbers = scanner.nextLine();

        String[] nums = numbers.split(",");

        int sum = 0;

        for (int i = 0; i < nums.length ; i++) {

            int temp = Integer.parseInt(nums[i]);
            sum = sum + temp;

        }

        System.out.println("Total is: " + sum);


    }



}
