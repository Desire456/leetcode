package org.example.array.plusone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void plusOne() {
        var solution = new Solution();

        int[] digits = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(digits));

        digits = new int[]{4, 3, 2, 1};
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(digits));

        digits = new int[]{9};
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(digits));

        digits = new int[]{9, 9};
        assertArrayEquals(new int[]{1, 0, 0}, solution.plusOne(digits));
    }
}
