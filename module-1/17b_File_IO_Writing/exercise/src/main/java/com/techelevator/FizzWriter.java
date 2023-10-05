package com.techelevator;

import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FizzWriter {
	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	public void run() {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the destination file path for FizzBuzz: ");
		String outputPath = userInput.nextLine();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
			for (int i = 1; i <= 300; i++) {
				String line = "";

				if (i % 3 == 0) {
					line += "Fizz";
				}

				if (i % 5 == 0) {
					line += "Buzz";
				}

				if (line.isEmpty()) {
					line = String.valueOf(i);
				}

				writer.write(line);
				writer.newLine();
			}

			System.out.println("FizzBuzz data has been written to the file.");
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file: " + e.getMessage());
		}
	}
}
