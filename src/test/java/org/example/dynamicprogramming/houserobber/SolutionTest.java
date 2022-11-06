package org.example.dynamicprogramming.houserobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void rob() {
        var solution = new Solution();

        var nums = new int[]{1, 2, 3, 1};
        assertEquals(4, solution.rob(nums));

        nums = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, solution.rob(nums));

        nums = new int[] {1, 2, 3, 1000, 10, 100, 1000};
        assertEquals(2002, solution.rob(nums));
    }
}
