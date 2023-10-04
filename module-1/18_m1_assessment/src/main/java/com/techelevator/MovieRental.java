package com.techelevator;

public class MovieRental {
    String title;
    String format;
    boolean isPremiumMovie;
    double rentalPrice;

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;

    }
    @Override
    public String toString() {
        return "MOVIE: " + title + " - FORMAT:" + format + "PRICE: " + rentalPrice;

    }
    private double calculateRentalPrice() {
        double basePrice = 0.0;
        if (format.equals("VHS")) {
            basePrice = 0.99;
        } else if (format.equals("DVD")) {
            basePrice = 1.99;
        } else if (format.equals("BluRay")) {
            basePrice = 2.99;
        }

        if (isPremiumMovie) {
            basePrice += 1.00;
        }
        return basePrice;
    }



}
