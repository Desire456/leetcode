package org.example.math.romantointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void romanToInt() {
        var solution = new Solution();

        assertEquals(3, solution.romanToInt("III"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
