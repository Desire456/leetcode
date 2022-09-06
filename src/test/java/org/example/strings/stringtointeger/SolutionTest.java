package org.example.strings.stringtointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void myAtoi() {
        var solution = new Solution();
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi(Integer.MAX_VALUE + "999"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi(Integer.MIN_VALUE + "999"));
    }
}
