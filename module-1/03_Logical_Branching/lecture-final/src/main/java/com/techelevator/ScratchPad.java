package com.techelevator;

public class ScratchPad {


    public static void main(String[] args) {

        // if weather is nice we will wash the car
        boolean isWeatherNice = true;

        if (isWeatherNice) {
            System.out.println("Wash the car");
        }
        else {
            System.out.println("Be lazy!");
        }

        //declare some variables for
        // payRate = 3.50
        double payRate = 3.50;
        // hoursWorked = 41
        int hoursWorked = 45;
        double overTimePayRate  = payRate * 1.5;
        double basePay = 0;

        // if work more than 40 hours calculate pay + overtime
        if (hoursWorked > 40) {

            // calculate how many hours are greater than 40
            int hoursOT = hoursWorked - 40;
            // multiple OT rate by hours greater than 40
            double overTimePay = overTimePayRate * hoursOT;

            //now calculate base time (40 hours * hourly rate)
            basePay = payRate * 40;

            System.out.println("Your pay is: " + (basePay + overTimePay));
        }
        else {
            //calculate normal pay
            basePay = payRate * hoursWorked;
            System.out.println("Your pay is: " + (basePay));
        }









    }

}
