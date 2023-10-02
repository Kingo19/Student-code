package com.techelevator;


import java.sql.SQLOutput;

public class Player extends Employee implements Playable {

    //MEMBER VARIABLES AKA INSTANCE VARIABLES AKA CLASS VARIABLES AKA PROPERTIES

    private int playerNumber;
    private String position;

    //CONSTRUCTORS (IF ANY)
    public Player(int playerNumber, String firstName, String lastName, int employeeId) {
        super(firstName, lastName, employeeId);
        this.playerNumber = playerNumber;
    }

    // REGULAR METHODS


    // GETTERS/SETTERS

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void makePlay() {
        System.out.println("make a play");
    }

    @Override
    public void getHurt() {
        System.out.println("Ouch");
    }

    @Override
    public void printStats() {
        //don't really print anything here. better to change this later to return the info
    }
}
