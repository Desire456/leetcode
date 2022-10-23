package org.example.other.numberof1bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void hammingWeight() {
        var solution = new Solution();

        assertEquals(3, solution.hammingWeight(7));
        assertEquals(1, solution.hammingWeight(256));
        assertEquals(31, solution.hammingWeight(-3));
    }
}
