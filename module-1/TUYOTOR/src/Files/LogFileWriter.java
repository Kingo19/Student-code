package Files;

import Items.CandyStoreItems;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFileWriter {
    private String fileName = "Log.txt";
    public void writeLogCandySelection(CandyStoreItems candy, double balance) {
        try (FileWriter fileWriter = new FileWriter(fileName); PrintWriter printWriter = new PrintWriter(fileWriter)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
            String timeStamp = dateFormat.format(new Date());
            String logMessage = timeStamp + " " + candy.getQuantity() + candy.getName() + " " + candy.getID() + " $" + candy.getQuantity() * candy.getPrice() + " $" + balance;
            printWriter.println(logMessage);
        } catch (IOException e) {
            System.out.println("Error writing to logfile" + e.getMessage());
        }

    }

    public void writeLOgMoneyAdded(double oldBalance, double newBalance){
        try (FileWriter fileWriter = new FileWriter(fileName); PrintWriter printWriter = new PrintWriter(fileWriter)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
            String timeStamp = dateFormat.format(new Date());
            String balanceLogMessage = timeStamp + "MONEY RECIVED" + "$" + oldBalance + "$" + newBalance;
            printWriter.println(balanceLogMessage);
            } catch (IOException e) {
            System.out.println("Error writing to logfile" + e.getMessage());
        }


    }
    public void writeLogChangeGiven(double oldBalance) {
        try (FileWriter fileWriter = new FileWriter(fileName); PrintWriter printWriter = new PrintWriter(fileWriter)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
            String timeStamp = dateFormat.format(new Date());
            String logMessage = timeStamp + "MONEY RECIVED" + "$" + oldBalance;
            printWriter.println(logMessage);
        } catch (IOException e) {
            System.out.println("Error writing to logfile" + e.getMessage());
        }
    }

}
