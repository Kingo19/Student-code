package com.techelevator;

import com.techelevator.DateFashion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DateFashionTests {

    private DateFashion dateFashion;

    @Before
    public void setUp() {
        dateFashion = new DateFashion();
    }

    @Test
    public void getATable_BothStylish_Returns2() {
        // Arrange (setup input)
        int you = 9;  // Stylishness of you
        int date = 8;  // Stylishness of date

        // Act (execute the method you're testing)
        int result = dateFashion.getATable(you, date);

        // Assert (check if the result is as expected)
        Assert.assertEquals(2, result);
    }

    @Test
    public void getATable_YouUnstylish_Returns0() {
        // Arrange
        int you = 2;
        int date = 9;

        // Act
        int result = dateFashion.getATable(you, date);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void getATable_DateUnstylish_Returns0() {
        // Arrange
        int you = 7;
        int date = 1;

        // Act
        int result = dateFashion.getATable(you, date);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void getATable_BothUnstylish_Returns0() {
        // Arrange
        int you = 2;
        int date = 1;

        // Act
        int result = dateFashion.getATable(you, date);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void getATable_YouMarginallyStylish_Returns1() {
        // Arrange
        int you = 5;
        int date = 7;

        // Act
        int result = dateFashion.getATable(you, date);

        // Assert
        Assert.assertEquals(1, result);
    }

    @Test
    public void getATable_DateMarginallyStylish_Returns1() {
        // Arrange
        int you = 7;
        int date = 5;

        // Act
        int result = dateFashion.getATable(you, date);

        // Assert
        Assert.assertEquals(1, result);
    }
}
