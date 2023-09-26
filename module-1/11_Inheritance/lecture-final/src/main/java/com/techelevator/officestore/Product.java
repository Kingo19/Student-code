package com.techelevator.officestore;

public class Product {

    private int size;
    private double price;
    private String brand;
    private String color;

    //subclasses will not inherit this... classes that extend this class
    // will call this by using super(size, brand, color)
    public Product (int size, String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }



    public int getSize() {
        return size;
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



    public String getColor() {
        return color;
    }

}
