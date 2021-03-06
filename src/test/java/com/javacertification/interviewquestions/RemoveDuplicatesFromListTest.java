package com.javacertification.interviewquestions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.javacertification.interviewquestions.ListUtils.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RemoveDuplicatesFromListTest {

    @Parameters
    public static Collection data() {
        return asList(new Object[][]{
                {asList(1, 1, 2, 2, 3, 3), asList(1, 2, 3)},
                {asList("a", "a", "b", "c", "b"), asList("a", "b", "c")},
                {asList(5f, 4f, 5f, 4f), asList(5f, 4f)},
                {null, Collections.emptyList()},
                {asList(1, 5f, 3d, 4L, 4, 9, "a", "@", 0, null, null, "@"), asList(1, 5f, 3d, 4L, 4, 9, "a", "@", 0, null)}
        });
    }

    @Parameter(value = 0)
    public List originalList;

    @Parameter(value = 1)
    public List expectedList;

    @Test
    public void shouldRemoveDuplicates_andKeepOrder() {
        assertEquals(expectedList, removeDuplicates(originalList));
    }
}