package com.techelevator.store;

public class Marker implements Sellable{

    private String brand;
    private int inventoryCount = 0;
    private double price;

    public Marker(String brand) {
        this.brand = brand;
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getInventoryCount() {
        return this.inventoryCount;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int addToInventory(int amountOfQtyToAdd) {
        return this.inventoryCount = this.inventoryCount + amountOfQtyToAdd;
    }

    @Override
    public String getItemName() {
        return "Marker ";
    }

    public String getBrand() {
        return brand;
    }

}
