package org.example.math.powerofthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isPowerOfThree() {
        var solution = new Solution();

        assertTrue(solution.isPowerOfThree(1));
        assertFalse(solution.isPowerOfThree(0));
        assertTrue(solution.isPowerOfThree(3));
        assertFalse(solution.isPowerOfThree(6));
        assertTrue(solution.isPowerOfThree(9));
    }
}
