package com.techelevator;

import java.util.*;

public class Roster {

    //INSTANCE VARIABLE
    private Map<Integer, Employee> employeesMap = new HashMap<>();
    private ReportWriter writer = new ReportWriter();

    public Roster() {
        RosterFileReader fileReader = new RosterFileReader();
        employeesMap = fileReader.loadData();
        writer.writeToFile("Loaded Player Data From File");
    }



    //METHODS
    public boolean addPlayer (Player newPlayer) {
        employeesMap.put(newPlayer.getPlayerNumber(), newPlayer);
        writer.writeToFile("Player added: " +newPlayer.toString());
        return true;
    }

    public boolean removePlayer(int employeeId) {
        writer.writeToFile(("Player to remove: " +  employeesMap.get(employeeId).toString()));
        employeesMap.remove(employeeId);
        return true;
    }

    public boolean removeCoach(int employeeId) {
        employeesMap.remove(employeeId);
        return true;
    }

    public List<Player> retrieveListOfPlayers() {

        List<Player> playersList = new ArrayList<>();

        //LOOP THROUGH THE MAP and CONVERT TO LIST - OPTION 1 (USING KEYSET / SET)
//        Set<Integer> keys = playerMap.keySet();
//
//        for (Integer key : keys) {
//            Player temp = playerMap.get(key);
//            playersList.add(temp);
//        }

        // OPTION 2 USING MAP.ENTRY
        for(Map.Entry<Integer, Employee> row : employeesMap.entrySet()) {
            if (row.getValue() instanceof Player) {
                playersList.add((Player)row.getValue());
            }
        }


        return playersList;
    }

    public List<Coach> retrieveListOfCoaches() {

        List<Coach> coachesList = new ArrayList<>();


        // OPTION 2 USING MAP.ENTRY
        for(Map.Entry<Integer, Employee> row : employeesMap.entrySet()) {
            if (row.getValue() instanceof Coach) {
                coachesList.add((Coach)row.getValue());
            }
        }


        return coachesList;
    }

}
