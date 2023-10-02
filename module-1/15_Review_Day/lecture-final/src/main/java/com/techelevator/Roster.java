package com.techelevator;

import java.util.*;

public class Roster {

    //INSTANCE VARIABLE
    private Map<Integer, Employee> employeesMap = new HashMap<>();

    public Roster() {
//  public Player(int playerNumber, String firstName, String lastName, int employeeId)

        //TODO change this later to get this information from a file.
        Player player1 = new Player(10, "Bob", "Smith", 100);
        Player player2 = new Player(12, "Jane", "Smith", 101);
        Player player3 = new Player(14, "Sally", "Smith", 102);

        Coach coach = new Coach("Bob", "Knight", 200);

        employeesMap.put(100, player1);
        employeesMap.put(101, player2);
        employeesMap.put(102, player3);
        employeesMap.put(200, coach);

    }



    //METHODS
    public boolean addPlayer (Player newPlayer) {
        employeesMap.put(newPlayer.getPlayerNumber(), newPlayer);
        return true;
    }

    public boolean removePlayer(int employeeId) {
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

}
