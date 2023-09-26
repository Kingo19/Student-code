package com.techelevator.officestore;

public class Marker extends Product{


    private String inkType;

    // we create a marker, but parent class (Product) is forcing us to
    //provide this info and we send it by calling super(size, brand, color) up to
    // the Product class
    public Marker(int size, String brand, String color, String inkType) {
        super(size, brand, color);
        this.inkType = inkType;

    }

    public String toString() {
        return this.getBrand() + " " + this.getColor() + " " + this.getInkType();
    }


    public String getInkType() {
        return inkType;
    }

}
