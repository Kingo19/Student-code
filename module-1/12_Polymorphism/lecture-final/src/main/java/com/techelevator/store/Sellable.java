package com.techelevator.store;

public interface Sellable {

    double getPrice();
    int getInventoryCount();
    void setPrice(double price);
    int addToInventory(int amountOfQtyToAdd);
    String getItemName();

}
