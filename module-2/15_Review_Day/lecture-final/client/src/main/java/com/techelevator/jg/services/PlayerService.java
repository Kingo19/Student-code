package com.techelevator.jg.services;

import com.techelevator.jg.model.Player;
import org.springframework.web.client.RestTemplate;

public class PlayerService {

    private final String API_BASE_URL;
    private final RestTemplate restTemplate = new RestTemplate();

    public PlayerService (String API_BASE_URL) {
        this.API_BASE_URL = API_BASE_URL;
    }

    public Player[] fetchListOfPlayers() {

        return restTemplate.getForObject(API_BASE_URL + "/players", Player[].class);


    }


}
