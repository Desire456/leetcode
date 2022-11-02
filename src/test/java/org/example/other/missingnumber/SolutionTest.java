package org.example.other.missingnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void missingNumber() {
        var solution = new Solution();

        int[] nums = new int[]{3, 0, 1};
        assertEquals(2, solution.missingNumber(nums));

        nums = new int[]{0, 1};
        assertEquals(2, solution.missingNumber(nums));

        nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, solution.missingNumber(nums));
    }
}
