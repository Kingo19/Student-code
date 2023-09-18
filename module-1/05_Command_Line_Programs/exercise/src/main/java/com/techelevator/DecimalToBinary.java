package com.techelevator;

public class DecimalToBinary {
	public static void main(String[] args) {
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