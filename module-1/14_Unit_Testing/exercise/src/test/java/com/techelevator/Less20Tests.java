package com.techelevator;

import com.techelevator.Less20;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Less20Tests {

    private Less20 less20;

    @Before
    public void setUp() {
        less20 = new Less20();
    }

    @Test
    public void isLessThanMultipleOf20_OneLess_ReturnsTrue() {
        // Arrange (setup input)
        int n = 19;

        // Act (execute the method you're testing)
        boolean result = less20.isLessThanMultipleOf20(n);

        // Assert (check if the result is as expected)
        Assert.assertTrue(result);
    }

    @Test
    public void isLessThanMultipleOf20_TwoLess_ReturnsTrue() {
        // Arrange
        int n = 18;

        // Act
        boolean result = less20.isLessThanMultipleOf20(n);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isLessThanMultipleOf20_NotLess_ReturnsFalse() {
        // Arrange
        int n = 20;

        // Act
        boolean result = less20.isLessThanMultipleOf20(n);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isLessThanMultipleOf20_MultipleOf20_ReturnsFalse() {
        // Arrange
        int n = 40;

        // Act
        boolean result = less20.isLessThanMultipleOf20(n);

        // Assert
        Assert.assertFalse(result);
    }
}
