package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {


    public static void main(String[] args) {

        // BE ABLE TO DECLARE AND INSTANTIATE A MAP
        Map<String, Integer> homes = new HashMap<>();
        Map<Integer, String> numsAsFizz = new HashMap<>();


        // BE ABLE TO PUT THINGS IN A MAP
        homes.put("43012", 10);
        homes.put("43018", 6);
        homes.put("43081", 19);
        homes.put("5555", 0);


        //BE ABLE TO GET THINGS OUT OF A MAP

        Integer numOfHomesAt43012 = homes.get("43012");

        System.out.println(numOfHomesAt43012);

        // WHAT HAPPENS IF SOMETHING ISN"T IN THE MAP?
        Integer somethingThatIsntInMap = homes.get("99999");

        // IF SOMETHING IS NOT FOUND IN A MAP -->  MAP WILL RETURN NULL
        if (somethingThatIsntInMap == null) {
            System.out.println("Zip code not found!");
        }

        // WHAT HAPPENS IF I PUT SOMETHING ELSE IN WITH THE SAME KEY
        homes.put("5555", 10);

        System.out.println("");

        if (homes.containsKey("5555")) {
            Integer count = homes.get("5555");
            homes.put("5555", ++count);
        }

        if (!homes.isEmpty()) {
            //would fall in here is items are in the map
        }

        System.out.println("Size before: " + homes.size());

        homes.remove("5555");
        //homes.clear(); removes everything

        System.out.println("Size after: " + homes.size());






    }


}
