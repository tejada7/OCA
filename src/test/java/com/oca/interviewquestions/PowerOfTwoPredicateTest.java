package com.oca.interviewquestions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PowerOfTwoPredicateTest {

    /**
     * Dataset.
     *
     * @return a collection that contains the value to which we evaluate to know if it belong to a power of 2 and the
     * expected result.
     */
    @Parameters
    public static Collection<Object> getData() {
        return Arrays.asList(new Object[][]{
                {4, true},
                {27, false},
                {124, false},
                {0, true}
        });
    }

    @Parameter
    public int input;

    @Parameter(value = 1)
    public boolean expectedOutput;

    @Test
    public void powerOfTest() {
        Assert.assertEquals(expectedOutput, new IsPowerOfTwo().test(input));
    }
}