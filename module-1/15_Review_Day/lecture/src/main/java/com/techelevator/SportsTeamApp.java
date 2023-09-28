package com.techelevator;

import java.util.List;

public class SportsTeamApp {


    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        Roster roster = new Roster();


        while (true) {

            int choice = ui.printMainMenu();
            if (choice == 1) {
                //we need to go to the Roster class to get our data
                List<Player> players  = roster.retrieveListOfPlayers();
                ui.printRoster(players);


            }
            else if( choice == 2) {
                //add a new player

            }
            else if (choice == 3) {
                //delete a player
            }
            else if (choice == 4) {
                //exit
                break;
            }
            else {
                System.out.println("Invalid option");
            }


        }



    }

}
