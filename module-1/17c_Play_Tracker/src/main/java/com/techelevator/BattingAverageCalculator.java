package com.techelevator;

import java.util.Scanner;

public class BattingAverageCalculator {

    public double calculateBattingAverage(Stats stats) throws BattingAverageException  {

        if (stats.getAtBats() <= 0) {
            throw new BattingAverageException("You must provide a number of atBats > 0", stats);
        }

        return (double) stats.getHits() / stats.getAtBats();

    }


}
