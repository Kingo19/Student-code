package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
//        Truck car1 = context.getBean(Truck.class);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car1 = context.getBean(Car.class);

        car1.setBrand("Honda");
        car1.setModel("Accord");
        car1.setName("Apache");

        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
    }

}