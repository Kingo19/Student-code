package com.techelevator;

import com.techelevator.NonStart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NonStartTests {

    private NonStart nonStart;

    @Before
    public void setUp() {
        nonStart = new NonStart();
    }

    @Test
    public void getPartialString_NonEmptyStrings_ReturnsConcatenatedStringWithoutFirstChars() {
        // Arrange (setup input)
        String a = "Hello";
        String b = "There";

        // Act (execute the method you're testing)
        String result = nonStart.getPartialString(a, b);

        // Assert (check if the result is as expected)
        Assert.assertEquals("ellohere", result);
    }

    @Test
    public void getPartialString_EmptyString_ReturnsEmptyString() {
        // Arrange
        String a = "";
        String b = "Java";

        // Act
        String result = nonStart.getPartialString(a, b);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void getPartialString_NullStrings_ReturnsEmptyString() {
        // Arrange
        String a = null;
        String b = null;

        // Act
        String result = nonStart.getPartialString(a, b);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void getPartialString_OneEmptyString_ReturnsConcatenatedStringWithoutFirstChar() {
        // Arrange
        String a = "Python";
        String b = "";

        // Act
        String result = nonStart.getPartialString(a, b);

        // Assert
        Assert.assertEquals("ython", result);
    }
}
