package com.techelevator;

import java.util.Scanner;

public class CommandLineProgram {

    public static void main(String[] args) {
//        Create a scanner so we can read input from tbe user.
        Scanner myScanner = new Scanner(System.in);
        boolean driving = true;
        while (driving) {

            System.out.println("Are we there yet? (Y) or (N)o");
            String answer = myScanner.nextLine();

            System.out.print(answer);
        }
    }

}
