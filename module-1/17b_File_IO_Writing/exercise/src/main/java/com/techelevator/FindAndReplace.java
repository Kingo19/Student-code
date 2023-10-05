package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the search word? ");
        String searchWord = userInput.nextLine();

        System.out.print("What is the replacement word? ");
        String replacementWord = userInput.nextLine();

        System.out.print("What is the source file? ");
        String sourceFilePath = userInput.nextLine();

        System.out.print("What is the destination file? ");
        String destinationFilePath = userInput.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {

                line = line.replace(searchWord, replacementWord);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Find and replace completed. Data written to the destination file.");
        } catch (IOException e) {
            System.err.println("An error occurred while processing the files: " + e.getMessage());
        }
    }
}
