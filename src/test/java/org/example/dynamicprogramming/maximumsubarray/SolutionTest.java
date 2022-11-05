package org.example.dynamicprogramming.maximumsubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void maxSubArray() {
        var solution = new Solution();

        var nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.maxSubArray(nums));

        nums = new int[]{1};
        assertEquals(1, solution.maxSubArray(nums));

        nums = new int[]{5, 4, -1, 7, 8};
        assertEquals(23, solution.maxSubArray(nums));
    }
}
