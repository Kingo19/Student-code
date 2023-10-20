package com.techelevator;

import com.techelevator.domain.Player;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);

    public int printMainMenu() {

        System.out.println("1. View List Of Players");
        System.out.println("2. View Player By Jersey Number");
        System.out.println("3. Add a new player");
        System.out.println("4. Delete a player");
        System.out.println("5. Exit");
        System.out.println("Please choose now:");

        return Integer.parseInt(scanner.nextLine());

    }

    public void printRoster(List<Player> playerList) {
        //TODO

    }

    public void printMessage(String message) {
        System.out.println(message);
    }


}
