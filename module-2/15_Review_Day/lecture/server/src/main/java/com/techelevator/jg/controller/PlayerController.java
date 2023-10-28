package com.techelevator.jg.controller;

import com.techelevator.jg.model.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
   @RequestMapping(path = "/heartbeat", method = RequestMethod.GET)
    public String heartBeat() {
        return "deh-dump";
    }

    public List <Player> fetchAllPlayers () {
       @RequestMapping
    }
}
