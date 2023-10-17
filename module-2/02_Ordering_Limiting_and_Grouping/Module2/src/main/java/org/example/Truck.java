package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor

public class Truck implements Viachle {
    private String brand;
    private String name;
    private String model;


    @Override
    public void makeSound() {
        System.out.println("Hrrrrrmmmmmm...");
    }
}
