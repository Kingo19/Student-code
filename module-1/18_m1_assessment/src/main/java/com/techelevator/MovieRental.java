package com.techelevator;

class MovieRental {
    private String title;
    private String format;
    private boolean isPremiumMovie;
    private double rentalPrice;

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
        this.rentalPrice = calculateRentalPrice();
    }

    @Override
    public String toString() {
        return "MOVIE: " + title + " - FORMAT: " + format + " PRICE: " + rentalPrice;
    }

    public double calculateLateFee(int daysLate) {
        if (daysLate == 0) {
            return 0.00;
        } else if (daysLate == 1) {
            return 1.99;
        } else if (daysLate == 2) {
            return 3.99;
        } else {
            return 19.99;
        }
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
