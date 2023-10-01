package com.techelevator;

import com.techelevator.WordCount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

public class WordCountTests {

    private WordCount wordCount;

    @Before
    public void setUp() {
        wordCount = new WordCount();
    }

    @Test
    public void getCount_NonEmptyArray_ReturnsMapWithWordCounts() {
        // Arrange (setup input)
        String[] words = {"ba", "ba", "black", "sheep"};

        // Act (execute the method you're testing)
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert (check if the result is as expected)
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getCount_EmptyArray_ReturnsEmptyMap() {
        // Arrange
        String[] words = {};

        // Act
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert
        Map<String, Integer> expected = new HashMap<>();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getCount_NullArray_ReturnsEmptyMap() {
        // Arrange
        String[] words = null;

        // Act
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert
        Map<String, Integer> expected = new HashMap<>();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getCount_ArrayWithOneWord_ReturnsMapWithCountOfOne() {
        // Arrange
        String[] words = {"apple"};

        // Act
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getCount_ArrayWithDuplicateWords_ReturnsMapWithCounts() {
        // Arrange
        String[] words = {"a", "b", "a", "c", "b"};

        // Act
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        Assert.assertEquals(expected, result);
    }
}
