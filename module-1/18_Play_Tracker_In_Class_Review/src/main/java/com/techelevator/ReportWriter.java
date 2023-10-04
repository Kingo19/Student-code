package com.techelevator;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReportWriter {

    private String fileName = "Log.txt";

    public void writeToFile(String message) {

          File logFile = new File(fileName);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {

            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(dateTimeFormatter.format(now) + " " + message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }


    }



}
