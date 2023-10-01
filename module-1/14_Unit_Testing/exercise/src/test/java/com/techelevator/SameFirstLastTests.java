package com.techelevator;

import com.techelevator.SameFirstLast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SameFirstLastTests  {

    private SameFirstLast sameFirstLast;

    @Before
    public void setUp() {
        sameFirstLast = new SameFirstLast();
    }

    @Test
    public void isItTheSame_ArrayWithSameFirstAndLast_ReturnsTrue() {
        // Arrange (setup input)
        int[] nums = {1, 2, 3, 1};

        // Act (execute the method you're testing)
        boolean result = sameFirstLast.isItTheSame(nums);

        // Assert (check if the result is as expected)
        Assert.assertTrue(result);
    }

    @Test
    public void isItTheSame_ArrayWithDifferentFirstAndLast_ReturnsFalse() {
        // Arrange
        int[] nums = {1, 2, 3, 4, 5};

        // Act
        boolean result = sameFirstLast.isItTheSame(nums);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isItTheSame_EmptyArray_ReturnsFalse() {
        // Arrange
        int[] nums = {};

        // Act
        boolean result = sameFirstLast.isItTheSame(nums);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isItTheSame_SingleElementArray_ReturnsTrue() {
        // Arrange
        int[] nums = {42};

        // Act
        boolean result = sameFirstLast.isItTheSame(nums);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isItTheSame_NullArray_ReturnsFalse() {
        // Arrange
        int[] nums = null;

        // Act
        boolean result = sameFirstLast.isItTheSame(nums);

        // Assert
        Assert.assertFalse(result);
    }
}
