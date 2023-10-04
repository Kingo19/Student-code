package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class UserInterface {


    private Scanner scanner = new Scanner(System.in);

    public int printMainMenu() {

        System.out.println("1. View List Of Players");
        System.out.println("2. Add a new player");
        System.out.println("3. Delete a player");
        System.out.println("4. Exit");
        System.out.println("5. Calculate Batting Average");
        System.out.println("Please choose now:");

        return Integer.parseInt(scanner.nextLine());

    }

    public Stats askUserForBatsAndHits() {

        Stats playerStats = new Stats();

        System.out.println("Enter times at bat:");
        int atBat = scanner.nextInt();
        scanner.nextLine();
        playerStats.setAtBats(atBat);

        System.out.println("Enter number of Hits");
        int hits = scanner.nextInt();
        scanner.nextLine();
        playerStats.setHits(hits);


        return playerStats;

        //TODO... need to deal with this later
    }


    public void printRoster(List<Player> playerList) {

        for (Player p : playerList ) {
            System.out.println(p.getPlayerNumber() + " " + p.getFullName());
        }


    }

    public void printMessage(String message) {

        System.out.println(message);
    }




}
