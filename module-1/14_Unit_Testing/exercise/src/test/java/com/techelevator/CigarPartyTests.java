package com.techelevator;

import com.techelevator.CigarParty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CigarPartyTests {

    private CigarParty cigarParty;

    @Before
    public void setUp() {
        cigarParty = new CigarParty();
    }

    @Test
    public void haveParty_WeekdayLessThan40Cigars_ReturnsFalse() {
        // Arrange (setup input)
        int cigars = 30;
        boolean isWeekend = false;

        // Act (execute the method you're testing)
        boolean result = cigarParty.haveParty(cigars, isWeekend);

        // Assert (check if the result is as expected)
        Assert.assertFalse(result);
    }

    @Test
    public void haveParty_WeekdayInRange_ReturnsTrue() {
        // Arrange
        int cigars = 50;
        boolean isWeekend = false;

        // Act
        boolean result = cigarParty.haveParty(cigars, isWeekend);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void haveParty_WeekendInRange_ReturnsTrue() {
        // Arrange
        int cigars = 70;
        boolean isWeekend = true;

        // Act
        boolean result = cigarParty.haveParty(cigars, isWeekend);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void haveParty_WeekendGreaterThan60Cigars_ReturnsTrue() {
        // Arrange
        int cigars = 80;
        boolean isWeekend = true;

        // Act
        boolean result = cigarParty.haveParty(cigars, isWeekend);

        // Assert
        Assert.assertTrue(result);
    }
}
