package com.techelevator;


public class Player {

    //MEMBER VARIABLES AKA INSTANCE VARIABLES AKA CLASS VARIABLES AKA PROPERTIES
    private String firstName;
    private String lastName;
    private int playerNumber;



    //CONSTRUCTORS (IF ANY)
    public Player(String firstName, String lastName, int playerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNumber = playerNumber;
    }


    // REGULAR METHODS


    //DERIVED PROPERTIES (completely optional)
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // GETTERS/SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
