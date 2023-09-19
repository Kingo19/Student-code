package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please type in a number");
		String userInput = myScanner.nextLine();

		int decimal = 15;
		String binary = "";


		while (decimal > 0) {

			int remainder = decimal % 2;


			binary = remainder + binary;


			decimal = decimal / 2;
		}


		System.out.println("The Binary number is  " + binary);
	}
}