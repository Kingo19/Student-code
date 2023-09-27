package com.techelevator.store;

public class Stapler implements Sellable, FLyable {

    private String color;
    private int inventoryCount = 0;
    private double price;

    public Stapler(String color) {
        this.color = color;
        this.price = 1.00;
    }

    public String getColor() {
        return color;
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getInventoryCount() {
        return this.inventoryCount;
    }

    @Override
    public int addToInventory(int amountOfQtyToAdd){
        return this.inventoryCount = this.inventoryCount + amountOfQtyToAdd;
    }

    @Override
    public String getItemName() {
        return "Stapler";
    }

    @Override
    public boolean fly() {
        return false;
    }
}
