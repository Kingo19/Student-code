package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MovieRentalTest {


    public class MovieRentalTests {

        @Test
        public void testRentalPriceCalculation() {
            // Create MovieRental objects with different formats and premium status
            MovieRental movie1 = new MovieRental("Movie1", "DVD", false);
            MovieRental movie2 = new MovieRental("Movie2", "BluRay", true);
            MovieRental movie3 = new MovieRental("Movie3", "VHS", false);
            
        }

        @Test
        public void testLateFeeCalculation() {
            // Create a MovieRental object
            MovieRental movie = new MovieRental("Movie4", "DVD", false);

            // Test late fees for different numbers of days late
            assertEquals(0.00, movie.calculateLateFee(0), 0.01);
            assertEquals(1.99, movie.calculateLateFee(1), 0.01);
            assertEquals(3.99, movie.calculateLateFee(2), 0.01);
            assertEquals(19.99, movie.calculateLateFee(3), 0.01);
        }
    }
}
