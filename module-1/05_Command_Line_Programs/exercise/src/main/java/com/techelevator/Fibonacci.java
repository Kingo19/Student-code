package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int fibonacci = scanner.nextInt();

		int x = 0;
		int y = 1;

		if (fibonacci >= 1) {
			System.out.println(x+" ");
		}

		if (fibonacci >= 2) {
			System.out.println(y);
		}

		for (int i = 3; i <= fibonacci; i++) {
			int sum = x + y;
			System.out.println(sum);
			x = y;
			y = sum;
		}
	}
}