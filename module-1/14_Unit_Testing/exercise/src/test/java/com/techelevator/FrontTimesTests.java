package com.techelevator;

import com.techelevator.FrontTimes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FrontTimesTests {

    private FrontTimes frontTimes;

    @Before
    public void setUp() {
        frontTimes = new FrontTimes();
    }

    @Test
    public void generateString_ShortString_ReturnsFrontRepeated() {
        // Arrange (setup input)
        String str = "Chocolate";
        int n = 2;

        // Act (execute the method you're testing)
        String result = frontTimes.generateString(str, n);

        // Assert (check if the result is as expected)
        Assert.assertEquals("ChoCho", result);
    }

    @Test
    public void generateString_LongString_ReturnsFrontRepeated() {
        // Arrange
        String str = "Abcdef";
        int n = 3;

        // Act
        String result = frontTimes.generateString(str, n);

        // Assert
        Assert.assertEquals("AbcAbcAbc", result);
    }

    @Test
    public void generateString_ShortString_NEquals1_ReturnsFrontOnce() {
        // Arrange
        String str = "Hi";
        int n = 1;

        // Act
        String result = frontTimes.generateString(str, n);

        // Assert
        Assert.assertEquals("Hi", result);
    }

    @Test
    public void generateString_EmptyString_ReturnsEmptyString() {
        // Arrange
        String str = "";
        int n = 3;

        // Act
        String result = frontTimes.generateString(str, n);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void generateString_NullString_ReturnsEmptyString() {
        // Arrange
        String str = null;
        int n = 2;

        // Act
        String result = frontTimes.generateString(str, n);

        // Assert
        Assert.assertEquals("", result);
    }
}
