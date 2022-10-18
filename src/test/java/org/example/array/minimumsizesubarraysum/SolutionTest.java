package org.example.array.minimumsizesubarraysum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        var solution = new Solution();

        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        assertEquals(2, solution.minSubArrayLen(target, nums));
    }
}
