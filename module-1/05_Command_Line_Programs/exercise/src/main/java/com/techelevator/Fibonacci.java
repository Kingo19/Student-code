package com.techelevator;

public class Fibonacci {
	public static void main(String[] args) {
		int length_num = 10;
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second + " ");

		for (int i = 2; i < length_num; i++) {
			int fibonacci = first + second;
			System.out.print(fibonacci + " ");


			first = second;
			second = fibonacci;
		}
	}
}
