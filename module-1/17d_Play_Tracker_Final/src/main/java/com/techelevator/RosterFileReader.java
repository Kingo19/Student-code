package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RosterFileReader {

    private File rosterFile = new File("team.txt");
    private Scanner rosterScanner;

    public RosterFileReader() {

        try {
            rosterScanner = new Scanner(rosterFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, Employee> loadData() {

        Map<Integer, Employee> teamMap = new TreeMap<>();


        // loop through the file
        while (rosterScanner.hasNextLine()) {
            //each row represents a team member(player or coach)
            String record = rosterScanner.nextLine();

            //split each record into a String[] called fields
            String[] fields = record.split(",");

            //put each field into a Employee object (check whether we create an coach or player)
            if (fields[0].equals("C")) {
                //we hava a coach
                Employee emp = new Coach(fields[1], fields[2], Integer.parseInt(fields[3]));
                teamMap.put(Integer.parseInt(fields[3]), emp);
            }
            else {
                //we have a player -        //P,bart,simpson,1002,15
                Employee player = new Player(Integer.parseInt(fields[4]),fields[1], fields[2], Integer.parseInt(fields[3]));
                teamMap.put(Integer.parseInt(fields[3]), player);

            }


            //end of loop
        }

        return teamMap;
    }




}
