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

//    @RequestMapping(method = RequestMethod.GET)
//    public List<Auction> auctionList(@RequestParam(required = false, name = "title_like") String title, @RequestParam(required = false, name = "currentBid_lte") double price) {
//        if (title == null && price == 0) {
//            return auctionDao.getAuctions();
//        } else if (title == null && !(price == 0)) {
//            return auctionDao.getAuctionsByMaxBid(price);
//        } else if (title != null && price == 0) {
//            return auctionDao.getAuctionsByTitle(title);
//        } else
//        return auctionDao.getAuctionsByTitleAndMaxBid(title, price);
//
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list() {
        return auctionDao.getAuctions();
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

