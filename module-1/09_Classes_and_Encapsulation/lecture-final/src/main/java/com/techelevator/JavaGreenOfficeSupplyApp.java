package com.techelevator;

import java.util.*;

public class JavaGreenOfficeSupplyApp {


    public static void main(String[] args) {


        Marker marker1 = new Marker();
        marker1.setBrand("Expo");
        marker1.setColor("Red");
        marker1.setItemCode("ABC");
        marker1.setPrice(0.01);
        marker1.setSize(4);


        Marker marker2 = new Marker("Black", "Pentel");
       //   marker2.setColor("Black");
        marker2.setItemCode("DEF");
        marker2.setPrice(3.00);
        marker2.setSize(4);

        Marker marker3 = new Marker("blue", "Acme");



        List<Marker> markers = new ArrayList<>();
        markers.add(marker1);
        markers.add(marker2);

        for (Marker m : markers) {
            System.out.println(m.getItemCode() + " " + m.getBrand() + " " + m.getPrice());
        }


        Map<String, Marker> productMap = new HashMap<>();
        productMap.put(marker1.getItemCode(), marker1);
        productMap.put(marker2.getItemCode(), marker2);

        for (Map.Entry<String, Marker> product : productMap.entrySet() ) {
          //  Marker temp = product.getValue();
            System.out.println(product.getKey() + " " + product.getValue().getBrand() + " " + product.getValue().getPrice());
        }



        Calculator calc = new Calculator();
        int sum = calc.add(2,2);
        System.out.println(sum);

        sum = calc.add(2,2,2);
        System.out.println(sum);


    }

}
