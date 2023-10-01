package com.techelevator;

import com.techelevator.StringBits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringBitsTests {

    private StringBits stringBits;

    @Before
    public void setUp() {
        stringBits = new StringBits();
    }

    @Test
    public void getBits_NonEmptyString_ReturnsStringWithEveryOtherChar() {
        // Arrange (setup input)
        String input = "Hello";

        // Act (execute the method you're testing)
        String result = stringBits.getBits(input);

        // Assert (check if the result is as expected)
        Assert.assertEquals("Hlo", result);
    }

    @Test
    public void getBits_EmptyString_ReturnsEmptyString() {
        // Arrange
        String input = "";

        // Act
        String result = stringBits.getBits(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void getBits_NullString_ReturnsEmptyString() {
        // Arrange
        String input = null;

        // Act
        String result = stringBits.getBits(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void getBits_SingleCharacterString_ReturnsSameCharacter() {
        // Arrange
        String input = "X";

        // Act
        String result = stringBits.getBits(input);

        // Assert
        Assert.assertEquals("X", result);
    }

    @Test
    public void getBits_TwoCharacterString_ReturnsFirstCharacter() {
        // Arrange
        String input = "AB";

        // Act
        String result = stringBits.getBits(input);

        // Assert
        Assert.assertEquals("A", result);
    }
}
