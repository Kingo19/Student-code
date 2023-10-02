package com.techelevator;

import java.util.List;

public class SportsTeamApp {

    //MENU CONSTANTS
    private final int FETCH_PLAYERS = 1;
    private final int ADD_PLAYER = 2;
    private final int DELETE_PLAYER = 3;
    private final int EXIT = 4;


    UserInterface ui = new UserInterface();
    Roster roster = new Roster();


    public static void main(String[] args) {
         SportsTeamApp app = new SportsTeamApp();
         app.run();
    }

    public void run() {

        while (true) {

            int choice = ui.printMainMenu();
            if (choice == FETCH_PLAYERS) {
                fetchPlayers();
            }
            else if( choice == ADD_PLAYER) {
                addPlayer();

            }
            else if (choice == DELETE_PLAYER) {
                deletePlayer();
            }
            else if (choice == EXIT) {
                //exit
                break;
            }
            else {
                ui.printMessage("Invalid Option");
            }


        }



    }


    private void fetchPlayers() {

        List<Player> players  = roster.retrieveListOfPlayers();
        ui.printRoster(players);

    }

    //TODO Do this later because I am a horrible procrastinator
    private void addPlayer() {
        //go to the ui to get player info.
        System.out.println("Not implemented yet");
        //send player obj to roster
    }

    private  void deletePlayer() {
        //go to the ui to get the emp id of the player we want to delete

        //call the roster to delete this player

    }

}
