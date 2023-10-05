package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	public static void main(String[] args) {
		Scanner convFarToCeli = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit.");
		double fahrenheit = convFarToCeli.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println(celsius + " Degree celsius");


	}
}
