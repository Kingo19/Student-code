package org.example;

public class Car {
    private String make;
    private String model;

    public void start() {
        System.out.println("Starting the " + make + " " + model + " car.");
    }

    // Getters and setters for make and model

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}