package com.techelevator.reservations.controllers;

import com.techelevator.reservations.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello!";

    }


    @RequestMapping(path = "/car", method = RequestMethod.GET)
    public Car getCars() {

        Car car1 = new Car();

        car1.setColour("Mustard Yellow");
        car1.setHp(2500);
        car1.setModel("Grand Cheroke");

        return car1;


    }
}
