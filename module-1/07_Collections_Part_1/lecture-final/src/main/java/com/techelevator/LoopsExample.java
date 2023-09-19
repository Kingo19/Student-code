package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class LoopsExample {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(5);
        scores.add(5);
        scores.add(6);
        scores.add(10);

        // BENEFITS
        //  - control x (skip values, loop backwards, etc)
        for (int x = 0; x< scores.size(); x++) {
            System.out.print(scores.get(x) + " ");
        }

        //FOR EACH (ENHANCED FOR LOOP)

        for (Integer score : scores) {
            System.out.println(score);
            if (score == 6) {
                break;
            }
        }

        //for each loop with arrays
        double[] prices = new double[] { 12.0, 11.23, 1.0} ;
        for (double price : prices) {
            System.out.println(price);
        }


    }


}
