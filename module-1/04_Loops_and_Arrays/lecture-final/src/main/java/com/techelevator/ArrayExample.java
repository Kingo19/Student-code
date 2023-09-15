package com.techelevator;

public class ArrayExample {


    public static void main(String[] args) {

        //set the number of qbs in our program
        int numberOfQBs = 5;

        // CREATE AND INSTANTIATE A ARRAY
        String[] quarterBacks = new String[numberOfQBs];
        int[] flies = new int[] { 1,2,3,1,2,3,2,34};

        double[] scores = {0.2, 3.4};

        String newQuarterBack = "Bob";


        // BE ABLE TO PUT THINGS IN OUR ARRAY
        quarterBacks[0] = "Tim";
        quarterBacks[1] = "Ty";
        quarterBacks[2] = "Doug";
        quarterBacks[3] = "Derek";
        quarterBacks[4] = "Brady";


        boolean didWeWinGame = false;

        // CHANGE OUR ARRAY
        if (!didWeWinGame) {
            quarterBacks[0] = "Bernie";
        }

        System.out.println("The starting QB is now: " + quarterBacks[0]);

        System.out.println("We have " + quarterBacks.length + " quarterbacks");





    }



}
