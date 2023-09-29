package com.techelevator;

import org.junit.*;
public class CalculatorTest {

    private Calculator myCalc;

    //    public int add (int a, int b)
    @Test
    public void test_adding_two_positive_integer() {

//        /       ARRANGE - Create any needed objects, variables or data structures we will neded to support testing inside this method.
        myCalc = new Calculator();

        //        ACT
        int sum = myCalc.add(2, 2);

    //        ASSERT
        Assert.assertEquals(4, sum);




        }

    }

