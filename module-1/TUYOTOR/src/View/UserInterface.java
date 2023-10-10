package View;

import Items.CandyStoreItems;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner myScanner = new Scanner(System.in);

    public int printMainMenu() {
        System.out.println("(1) Show Inventory");
        System.out.println("(2) Make Sale");
        System.out.println("(3) Quit");

        int choice = myScanner.nextInt();
        myScanner.hasNextLine();

        return choice;
    }

    public int printSalesMenu(double currentBalance) {
        System.out.println("(1) Take Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Sale");
        System.out.println("Current Customer Balance: $" + currentBalance);

        int choice = myScanner.nextInt();
        myScanner.hasNextLine();

        return choice;

    }

    public void printMessage(String message) {
        System.out.println("Message");
    }

    public double askAmountToAdd() {
        System.out.println("Enter amount to add: ");
        return myScanner.nextDouble();
    }

    public String selectProduct() {
        System.out.println("Select product ID: ");
        return myScanner.nextLine();
    }
    public int selectQuantity(){
        System.out.println("Select Quantity: ");
        return Integer.parseInt(myScanner.nextLine());

    }
    public void printInventory(List<CandyStoreItems> inventory){
        //loop through List print out each item
        System.out.printf("%-5s  %-15s  %-10s  %-10s  %-10s %n", "ID", "Name", "Wrapper", "Quantity", "Price");


        for(CandyStoreItems candy : inventory){
            if(candy.getQuantity() == 0){
                System.out.printf("%-5s  %-15s  %-10s  %-10s  %-10s %n", candy.getID(), candy.getName(), candy.isWrapped(), "SOLD OUT", "$" + candy.getPrice());
            }
            else {
                System.out.printf("%-5s  %-15s  %-10s  %-10s  %-10s %n", candy.getID(), candy.getName(), candy.isWrapped(), candy.getQuantity(), "$" + candy.getPrice());
            }
        }


    }
    public void printReceipt(List<CandyStoreItems> itemsBought, double subtotal, double change, String changeStatement) {

        for (CandyStoreItems candy : itemsBought){
            System.out.printf("%-5s  %-15s  %-30s  %-10s  %-5s  %n", candy.getQuantity(), candy.getName(), candy.getDescription(),  "$" + candy.getPrice(), "$" + candy.getQuantity() * candy.getPrice());
        }

        System.out.println("");
        System.out.println("Total: $" + subtotal);
        System.out.println("");
        System.out.println("Change: $" + change);
        System.out.println(changeStatement);

    }



}
