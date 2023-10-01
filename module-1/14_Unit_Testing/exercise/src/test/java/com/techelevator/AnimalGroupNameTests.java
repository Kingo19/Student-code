package com.techelevator;

import com.techelevator.AnimalGroupName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AnimalGroupNameTests {

    private AnimalGroupName animalGroupName;

    @Before
    public void setUp() {
        animalGroupName = new AnimalGroupName();
    }

    @Test
    public void getHerd_ValidAnimalName_ReturnsExpectedGroup() {
        // Arrange (setup input)
        String animalName = "elephant";

        // Act (execute the method you're testing)
        String result = animalGroupName.getHerd(animalName);

        // Assert (check if the result is as expected)
        Assert.assertEquals("Herd", result);
    }

    @Test
    public void getHerd_NullAnimalName_ReturnsUnknown() {
        // Arrange
        String animalName = null;

        // Act
        String result = animalGroupName.getHerd(animalName);

        // Assert
        Assert.assertEquals("unknown", result);
    }

    @Test
    public void getHerd_UnknownAnimalName_ReturnsUnknown() {
        // Arrange
        String animalName = "walrus";

        // Act
        String result = animalGroupName.getHerd(animalName);

        // Assert
        Assert.assertEquals("unknown", result);
    }

    @Test
    public void getHerd_CaseInsensitiveAnimalName_ReturnsExpectedGroup() {
        // Arrange
        String animalName = "Rhino";

        // Act
        String result = animalGroupName.getHerd(animalName);

        // Assert
        Assert.assertEquals("Crash", result);
    }
}
