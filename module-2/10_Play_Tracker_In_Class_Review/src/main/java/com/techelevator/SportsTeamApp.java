package com.techelevator;

import com.techelevator.domain.Player;

import java.util.List;

public class SportsTeamApp {

    //MENU CONSTANTS
    private final int FETCH_LIST_OF_PLAYERS = 1;
    private final int FETCH_PLAYER_BY_JERSEY_NUMBER = 2;
    private final int ADD_NEW_PLAYER = 3;
    private final int DELETE_PLAYER = 4;
    private final int EXIT = 5;


    UserInterface ui = new UserInterface();


    public static void main(String[] args) {
         SportsTeamApp app = new SportsTeamApp();
         app.run();
    }

    public void run()  {


        while (true) {

            int choice = ui.printMainMenu();
            if (choice == FETCH_LIST_OF_PLAYERS) {
                fetchPlayers();
            }
            else if( choice == FETCH_PLAYER_BY_JERSEY_NUMBER) {
                fetchPlayerByJerseyNumber();
            }
            else if( choice == ADD_NEW_PLAYER) {
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

    /**
     * Returns a list of all players for a specific team (only one team in database for now but could you ask the user for what team?)
     */
    private void fetchPlayers() {

        System.out.println("Implement me");
        //go to ui to ask user to enter a team name

        // go to dao to fetch list of that teams players

        //send retrieved info to ui to print,  if not found, notify the user


    }

    private void fetchPlayerByJerseyNumber() {

        System.out.println("Implement me");

        //ask ui to get player jersey from user

        //call dao to fetch user by jersey number

        //send player to ui to print

    }


    private void addPlayer() {

        System.out.println("Implement me");
        //go to the ui to get player info. (You will need a method to ask user for player info and return it as a player obj).
        //HINT: maybe call one method that returns a single object to send to dao,
        //BIGGER HINT: The user does not know the team id. They do know the team name, so you may need to ask the user for a team name first
        // so you can first look up that teams id,  and hold on to it so you can populate the player object before you send the rest of
        //the player info to the dao. (all that coordination should be here.)

        //send player info to the dao

        //send confirmation {id} - id is the id that was inserted in the database back to ui to print along with the name of the player added
        // (dao should return a player object)

    }

    private  void deletePlayer() {

        System.out.println("Implement me");
        //go to the ui to get the name of the player we want to delete

        //call the dao to retrieve the information

        //send confirmation to ui that player name was deleted

    }



}
