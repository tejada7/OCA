package com.oca.interviewQuestions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void oneCharacter() {
        assertTrue(StringUtils.recursivePermutation("A").contains("A"));
        assertTrue(StringUtils.iterativePermutation("A").contains("A"));
    }

    @Test
    public void twoCharacters() {
        List<String> result = StringUtils.recursivePermutation("AB");
        assertTrue(result.contains("AB"));
        assertTrue(result.contains("BA"));

        List<String> result1 = StringUtils.iterativePermutation("AB");
        assertTrue(result1.contains("AB"));
        assertTrue(result1.contains("BA"));
    }

    @Test
    public void threeCharacters() {
        List<String> result = StringUtils.recursivePermutation("ABC");
        assertTrue(result.contains("ACB"));
        assertTrue(result.contains("ABC"));
        assertTrue(result.contains("CAB"));
        assertTrue(result.contains("BCA"));
        assertTrue(result.contains("CBA"));
        assertTrue(result.contains("BAC"));

        List<String> result1 = StringUtils.iterativePermutation("ABC");
        assertTrue(result1.contains("ACB"));
        assertTrue(result1.contains("ABC"));
        assertTrue(result1.contains("CAB"));
        assertTrue(result1.contains("BCA"));
        assertTrue(result1.contains("CBA"));
        assertTrue(result1.contains("BAC"));
    }

    @Test
    public void isResultSizeFactorial() {
        List<String> result = StringUtils.recursivePermutation("12345678");
        assertEquals(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8, result.size());

        List<String> result1 = StringUtils.iterativePermutation("12345678");
        assertEquals(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8, result.size());
    }
}

