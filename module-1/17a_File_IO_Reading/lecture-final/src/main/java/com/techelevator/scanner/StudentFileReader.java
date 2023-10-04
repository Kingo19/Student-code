package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileReader {


    public static void main(String[] args) {

        File studentData = new File("students.txt");
        Scanner myFileScanner;

        List<Student> myStudents = new ArrayList<>();

        try {
            myFileScanner = new Scanner(studentData);

            while (myFileScanner.hasNextLine()) {    // while we have more lines to process
              //  System.out.println(myFileScanner.nextLine());  // print out one row at a time
                String record = myFileScanner.nextLine();

                // here is where we split each line into individual fields - aka split
                String[] fields = record.split(",");

                Student currentStudent = new Student();

                //populate each student with info from the file
                currentStudent.setGpa(Double.parseDouble(fields[3]));
                currentStudent.setAge(Integer.parseInt(fields[2]));
                currentStudent.setFirstName(fields[0]);
                currentStudent.setLastName(fields[1]);


                //add the student to the list
                myStudents.add(currentStudent);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (Student student : myStudents) {
            System.out.println(student.toString());
        }



    }




}
