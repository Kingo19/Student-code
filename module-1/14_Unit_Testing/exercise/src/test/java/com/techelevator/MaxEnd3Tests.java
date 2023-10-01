package com.techelevator;

import com.techelevator.MaxEnd3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MaxEnd3Tests {

    private MaxEnd3 maxEnd3;

    @Before
    public void setUp() {
        maxEnd3 = new MaxEnd3();
    }

    @Test
    public void makeArray_FirstIsLarger_ReturnsArrayWithFirstElement() {
        // Arrange
        int[] nums = {5, 2, 4};

        // Act
        int[] result = maxEnd3.makeArray(nums);

        // Assert
        int[] expected = {5, 5, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void makeArray_LastIsLarger_ReturnsArrayWithLastElement() {
        // Arrange
        int[] nums = {1, 2, 8};

        // Act
        int[] result = maxEnd3.makeArray(nums);

        // Assert
        int[] expected = {8, 8, 8};
        Assert.assertArrayEquals(expected, result);
    }
}
