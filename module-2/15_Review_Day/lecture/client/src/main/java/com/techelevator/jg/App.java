package com.techelevator.jg;

import com.techelevator.jg.model.AuthenticatedUser;
import com.techelevator.jg.model.UserCredentials;
import com.techelevator.jg.services.AuthenticationService;
import com.techelevator.jg.services.ConsoleService;

public class App {

    private static final String API_BASE_URL = "http://localhost:8080/";

    //menu options
    private static final int VIEW_ALL_PLAYERS = 1;
    private static final int VIEW_PLAYER_BY_ID = 2;
    private static final int ADD_NEW_PLAYER = 3;
    private static final int UPDATE_PLAYER = 4;
    private static final int DELETE_PLAYER = 5;
    private static final int EXIT = 6;

    private final ConsoleService consoleService = new ConsoleService();
    private final AuthenticationService authenticationService = new AuthenticationService(API_BASE_URL);

    private AuthenticatedUser currentUser;

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        consoleService.printGreeting();
        loginMenu();
        if (currentUser != null) {
            mainMenu();
        }
    }
    private void loginMenu() {
        int menuSelection = -1;
        while (menuSelection != 0 && currentUser == null) {
            consoleService.printLoginMenu();
            menuSelection = consoleService.promptForMenuSelection("Please choose an option: ");
            if (menuSelection == 1) {
                handleRegister();
            } else if (menuSelection == 2) {
                handleLogin();
            } else if (menuSelection != 0) {
                System.out.println("Invalid Selection");
                consoleService.pause();
            }
        }
    }

    private void handleRegister() {
        System.out.println("Please register a new user account");
        UserCredentials credentials = consoleService.promptForCredentials();
        if (authenticationService.register(credentials)) {
            System.out.println("Registration successful. You can now login.");
        } else {
            consoleService.printErrorMessage();
        }
    }

    private void handleLogin() {
        UserCredentials credentials = consoleService.promptForCredentials();
        currentUser = authenticationService.login(credentials);
        if (currentUser == null) {
            consoleService.printErrorMessage();
        }
    }

    private void mainMenu() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection("Please choose an option: ");
            if (menuSelection == VIEW_ALL_PLAYERS) {
                viewAllPlayers();
            } else if (menuSelection == VIEW_PLAYER_BY_ID) {
                viewPlayerById();
            } else if (menuSelection == ADD_NEW_PLAYER) {
                addNewPlayer();
            } else if (menuSelection == UPDATE_PLAYER) {
                updatePlayer();
            } else if (menuSelection == DELETE_PLAYER) {
                deletePlayer();
            } else if (menuSelection == EXIT) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }

	private void viewAllPlayers() {
		// TODO - Implement me
		
	}

	private void viewPlayerById() {
        // TODO - Implement me
	}

	private void addNewPlayer() {
        // TODO - Implement me
		
	}

	private void updatePlayer() {
        // TODO - Implement me
		
	}

	private void deletePlayer() {
        // TODO - Implement me
		
	}

}
