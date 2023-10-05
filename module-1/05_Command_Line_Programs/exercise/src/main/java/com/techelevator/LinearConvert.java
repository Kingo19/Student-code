package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args){
		Scanner convMeterToCM = new Scanner(System.in);
		System.out.println("Enter the length in Meter");
		double meter = convMeterToCM.nextDouble();
		double CM = meter * 100;
		System.out.println(CM + " Centimeters.");


	}


}
