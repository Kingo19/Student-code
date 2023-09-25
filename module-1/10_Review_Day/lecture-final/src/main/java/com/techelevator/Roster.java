package com.techelevator;

import java.util.*;

public class Roster {

    //INSTANCE VARIABLE
    private Map<Integer, Player> playerMap = new HashMap<>();

    public Roster() {

        Player player1 = new Player("Bob", "Smith", 10);
        Player player2 = new Player("Jane", "Smith", 12);
        Player player3 = new Player("Sally", "Smith", 14);

        playerMap.put(10, player1);
        playerMap.put(12, player2);
        playerMap.put(14, player3);

    }



    //METHODS
    public boolean addPlayer (Player newPlayer) {
        playerMap.put(newPlayer.getPlayerNumber(), newPlayer);
        return true;
    }

    public boolean removePlayer(int playerNumberToRemove) {
        playerMap.remove(playerNumberToRemove);
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
        for(Map.Entry<Integer, Player> row : playerMap.entrySet()) {
            playersList.add(row.getValue());
        }


        return playersList;
    }

}
