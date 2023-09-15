package com.techelevator;

public class ArrayExamples {

    public static void main(String[] args) {
//        set the number of qbs in our program
        int numberOfQBs = 5;

//        CREATE AND INSTANTIATE AN ARRAY
        String[] quarterBacks = new String[numberOfQBs];

//        BE ABLE TO PUT THINGS IN OUR ARRAY
        quarterBacks[0] = "Tim";
        quarterBacks[1] = "Ty";
        quarterBacks[2] = "Doug";
        quarterBacks[3] = "Derek";
        quarterBacks[4] = "Brady";

        boolean didWeWininGame = false;

        if (!didWeWininGame){
            quarterBacks[0] = "Bernie";
        }

        System.out.println("The starting QB is now");
    }
}
