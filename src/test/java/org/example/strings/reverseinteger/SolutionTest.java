package org.example.strings.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void reverseInteger() {
        var solution = new Solution();
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(1200));
        assertEquals(0, solution.reverse(1_999_999_999));
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }
}
