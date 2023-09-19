package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {


        //BE ABLE TO DECLARE AND INSTANTIATE AN ARRAYLIST
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        //BE ABLE TO ADD THINGS TO MY LIST
        names.add("Kristina");
        names.add("Forrest");
        names.add("Koby");
        names.add("Yousef");
        names.add("Christian");

        System.out.println(names);

        // YOU CAN INSERT THINGS BY ELEMENT ID
        names.add(2, "Ian");
        System.out.println(names);

        if (!names.isEmpty()) {
            System.out.println("Not empty");
        }
//
//
//        while (names.size() > 0) {
//             //remove the item one at a time
//             names.remove(0);   //first time through i = 0,  THEN we increment i
//
//              // or we can clear all items in the list
//              // names.clear();
//        }

        //NEED TO BE ABLE TO GET THINGS OUT OF AN ARRAY
        //String name = names.get(2);
        System.out.println("We have: " + names.get(2));

        //traditional for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

       //BE ABLE TO SEARCH FOR A VALUE IN AN ARRAYLIST
        if (names.contains("Ian")) {
            System.out.println("We found Ian at: " + names.indexOf("Ian"));
        }

        int indexOfBob = names.indexOf("Bob");
        System.out.println(indexOfBob);

        // for each 'name' in( : ) names (arraylist)
        for (String name : names) {
            System.out.println(name);
        }


        // Convert an arraylist into an array
        String[] students = new String[names.size()];

        for (int i = 0; i < names.size(); i++) {
            students[i] = names.get(i);
        }
        System.out.println("");

        //shortcut to convert an ArrayList into an array
        String[] newStudents  = names.toArray(new String[]);

        System.out.println(newStudents);











    }


}
