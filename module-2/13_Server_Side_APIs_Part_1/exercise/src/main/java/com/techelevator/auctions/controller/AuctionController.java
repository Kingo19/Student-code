package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> auctionList(@RequestParam(required = false, name = "title_like") String title, @RequestParam(required = false, name = "currentBid_lte") Double price) {
        if ((title == null) && (price == null)) {
            return auctionDao.getAuctions();
        }  if ((title == null) && (price != null)) {
            return auctionDao.getAuctionsByMaxBid(price);
        }  if ((title != null) && (price == null)) {
            return auctionDao.getAuctionsByTitle(title);
        }
        return auctionDao.getAuctionsByTitleAndMaxBid(title, price);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Auction getById(@PathVariable int id) {
        return auctionDao.getAuctionById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction add(@RequestBody Auction auction) {
        return auctionDao.createAuction(auction);
    }


}

