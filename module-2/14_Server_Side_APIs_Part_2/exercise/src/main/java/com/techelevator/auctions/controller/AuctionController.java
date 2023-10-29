package com.techelevator.auctions.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private final AuctionDao auctionDao;

    public AuctionController(AuctionDao auctionDao) {
        this.auctionDao = auctionDao;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Auction> create(@Valid @RequestBody Auction auction) {
        Auction createdAuction = auctionDao.createAuction(auction);

        if (createdAuction == null) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Auction could not be created");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(createdAuction);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Auction> get(@PathVariable int id) {
        Auction auction = auctionDao.getAuctionById(id);

        if (auction == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction Not Found");
        } else {
            return ResponseEntity.ok(auction);
        }
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Auction> update(@Valid @RequestBody Auction auction, @PathVariable int id) {
        Auction existingAuction = auctionDao.getAuctionById(id);

        if (existingAuction == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction Not Found");
        }

        auction.setId(id);
        Auction updatedAuction = auctionDao.updateAuction(auction);
        return ResponseEntity.ok(updatedAuction);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable int id) {
        int rowsAffected = auctionDao.deleteAuctionById(id);

        if (rowsAffected == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction Not Found");
        }

        return ResponseEntity.noContent().build();
    }
}
