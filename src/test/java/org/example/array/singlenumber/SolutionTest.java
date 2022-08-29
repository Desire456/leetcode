package org.example.array.singlenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void singleNumber() {
        var solution = new Solution();

        int[] nums = new int[]{1, 2, 2};
        assertEquals(1, solution.singleNumber(nums));

        nums = new int[]{1, 2, 3, 4, 5, 3, 1, 6, 2, 4, 5};
        assertEquals(6, solution.singleNumber(nums));
    }
}
