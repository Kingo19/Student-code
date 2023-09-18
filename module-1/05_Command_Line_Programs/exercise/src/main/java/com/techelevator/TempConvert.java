package com.techelevator;

public class TempConvert {
	public static void main(String[] args) {

		double fahrenheit = 80.0;
		double celsius = convertFahrenheitToCelsius(fahrenheit);

		System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");



	}


	public static double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}


	public static double convertCelsiusToFahrenheit(double celsius) {
		return celsius * 9 / 5 + 32;
	}
}
