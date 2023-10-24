package com.techelevator.auctions.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        ResponseEntity<Auction[]> response = restTemplate.getForEntity(API_BASE_URL, Auction[].class);
        return response.getBody();
    }

    public Auction getAuction(int id) {
        ResponseEntity <Auction> response = restTemplate.getForEntity(API_BASE_URL + "/" + id, Auction.class);
        return response.getBody();
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        ResponseEntity <Auction[]> response = restTemplate.getForEntity(API_BASE_URL + "?title_like=" + title, Auction[].class);
        return response.getBody();
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        ResponseEntity <Auction[]> response = restTemplate.getForEntity(API_BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        return response.getBody();
    }

}
