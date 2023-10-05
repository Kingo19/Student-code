package com.techelevator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSplitter {
	public static void main(String[] args) {
		FileSplitter fileSplitter = new FileSplitter();
		fileSplitter.run();
	}

	public void run() {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Where is the input file (please include the path to the file)? ");
		String inputFilePath = userInput.nextLine();

		System.out.print("How many lines of text (max) should there be in the split files? ");
		int maxLinesPerFile = userInput.nextInt();
		userInput.nextLine(); // Consume the newline character

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
			int fileCount = 1;
			int lineCount = 0;
			String line;

			// Create the first output file
			String outputFileName = getOutputFileName(inputFilePath, fileCount);
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

			while ((line = reader.readLine()) != null) {
				if (lineCount >= maxLinesPerFile) {
					// Close the current output file and create a new one
					writer.close();
					fileCount++;
					outputFileName = getOutputFileName(inputFilePath, fileCount);
					writer = new BufferedWriter(new FileWriter(outputFileName));
					lineCount = 0;
				}

				writer.write(line);
				writer.newLine();
				lineCount++;
			}

			// Close the last output file
			writer.close();

			System.out.println("Splitting completed. " + fileCount + " output files generated.");
		} catch (IOException e) {
			System.err.println("An error occurred while splitting the file: " + e.getMessage());
		}
	}

	private String getOutputFileName(String inputFilePath, int fileCount) {
		int lastDotIndex = inputFilePath.lastIndexOf(".");
		String prefix = inputFilePath.substring(0, lastDotIndex);
		String extension = inputFilePath.substring(lastDotIndex);
		return prefix + "-" + fileCount + extension;
	}

}
