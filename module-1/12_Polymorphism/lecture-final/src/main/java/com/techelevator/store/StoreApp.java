package com.techelevator.store;

import java.util.ArrayList;
import java.util.List;

public class StoreApp {


    public static void main(String[] args) {

        Marker redMarker = new Marker("Expo");
        redMarker.addToInventory(10);
        redMarker.setPrice(0.25);

        Marker blueMarker = new Marker("Pentel");
        blueMarker.addToInventory(10);
        blueMarker.setPrice(2.00);


        Stapler coolStapler = new Stapler("red");
        coolStapler.setPrice(50.00);
        coolStapler.addToInventory(1);

        Stapler regularNotCoolStapler = new Stapler("orange");
        regularNotCoolStapler.addToInventory(100);
        regularNotCoolStapler.setPrice(5.00);


        List<Sellable> items = new ArrayList<>();
        items.add(redMarker);
        items.add(blueMarker);
        items.add(coolStapler);
        items.add(regularNotCoolStapler);


        for (Sellable item: items) {
            System.out.println(item.getItemName() + " has a price of: " + item.getPrice());
        }




//        Notebook myFavoriteNoteBook = new Notebook();
//        items.add(myFavoriteNoteBook);







//        List myList = new JavaGreenList();
//        myList.








    }


}
