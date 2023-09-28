package com.techelevator;

import org.junit.*;

public class CalculatorTest {

    private Calculator myCalc;

    @Before
    public void run_before_each_test() {
        System.out.println("Before....");
        myCalc = new Calculator();
    }

    //public int add (int a, int b)
    @Test
    public void test_adding_two_positive_integers() {

        //ARRANGE  create any needed objects, variables or data structures we will need to support testing inside this method

        System.out.println("Test....");
        //ACT AND ASSERT
        Assert.assertEquals(4, myCalc.add(2,2));
        Assert.assertEquals(2, myCalc.add(2,0));
        Assert.assertEquals(118, myCalc.add(102,16));

    }

    @Test
    public void test_adding_two_negative_numbers() {

        System.out.println("Test....");

        //ACT AND ASSERT
        Assert.assertEquals(-4, myCalc.add(-2, -2));
        Assert.assertEquals(-3, myCalc.add(-3, 0));
        Assert.assertEquals(-40, myCalc.add(0, -40));

    }

    @Test
    public void test_adding_a_negative_number_and_positive_number() {

        System.out.println("Test....");

        //ACT AND ASSERT
        Assert.assertEquals(0, myCalc.add(-2, 2));
        Assert.assertEquals(-2, myCalc.add(-3, 1));
        Assert.assertEquals(-60, myCalc.add(-100, 40));

    }

    //public Result add (Request nums)
    @Test
    public void test_addition_of_objects_containing_positive_numbers() {

        //ARRANGE
        Request req1 = new Request(2,2);
        Request req2 = new Request(0,10);

        //ACT and ASSERT
        Result res = myCalc.add(req1);
        Assert.assertEquals(4, res.getResult());
        Assert.assertEquals(10, myCalc.add(req2).getResult());

    }

    @Test
    public void test_fizzbuzz_evenly_divided_by_3_returns_fizz() {


       Assert.assertEquals("fizz", myCalc.fizzBuzz(3));
        Assert.assertEquals("fizz", myCalc.fizzBuzz(9));
    }

    @Test
    public void test_fizzbuzz_evenly_divided_by_5_returns_buzz() {

    }

    @Test
    public void test_fizzbuzz_evenly_divided_by_3_and_5_returns_fizzbuzz() {
        Assert.fail();
    }


    @Test
    public void test_fizzbuzz_other_numbers() {
        Assert.fail();
    }

    //	public int[] testArraysEqual123()
    @Test
    public void test_two_arrays() {

        //ARRANGE
        int[] expectedArray = new int[] {1,2,3};

        //ACT AND ASSERT
   //     Assert.assertEquals(expectedArray, myCalc.testArraysEqual123());
        Assert.assertArrayEquals(expectedArray, myCalc.testArraysEqual123());


    }

    @After
    public void do_something_after_each_test() {
        System.out.println("After");
    }





}
