package com.techelevator;

import com.techelevator.Lucky13;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Lucky13Tests {

    private Lucky13 lucky13;

    @Before
    public void setUp() {
        lucky13 = new Lucky13();
    }

    @Test
    public void getLucky_NoOnesOrThrees_ReturnsTrue() {
        // Arrange (setup input)
        int[] nums = {0, 2, 4};

        // Act (execute the method you're testing)
        boolean result = lucky13.getLucky(nums);

        // Assert (check if the result is as expected)
        Assert.assertTrue(result);
    }

    @Test
    public void getLucky_ContainsOne_ReturnsFalse() {
        // Arrange
        int[] nums = {1, 2, 3};

        // Act
        boolean result = lucky13.getLucky(nums);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void getLucky_ContainsThree_ReturnsFalse() {
        // Arrange
        int[] nums = {1, 2, 4, 3};

        // Act
        boolean result = lucky13.getLucky(nums);

        // Assert
        Assert.assertFalse(result);
    }
}
