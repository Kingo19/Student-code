package com.techelevator;

public class Marker {

    //PRIVATE CLASS VARIABLES (INSTANCE VARIABLES)
    private String color;
    private int size;
    private double price;
    private String brand;
    private String itemCode;

    public Marker() {

    }

    public Marker(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }


    // METHODS
    public void write(String text) {
        System.out.println(text);
    }


    // GETTERS AND SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
