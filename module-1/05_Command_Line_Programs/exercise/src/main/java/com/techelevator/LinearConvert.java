package com.techelevator;

public class LinearConvert {
	public static void main(String[] args) {

		double meters = 10.0;
		double feet = convertMetersToFeet(meters);

		System.out.println(meters + " meters is equal to " + feet + " feet.");


		double feet_Two = 20.0;
		double meters_Two = convertFeetToMeters(feet_Two);

		System.out.println(feet_Two + " feet is equal to " + meters_Two + " meters.");
	}


	public static double convertMetersToFeet(double meters) {
		return meters * 3.28084;
	}


	public static double convertFeetToMeters(double feet) {
		return feet * 0.3048;
	}
}
