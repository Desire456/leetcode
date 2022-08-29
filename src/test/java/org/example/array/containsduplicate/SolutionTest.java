package org.example.array.containsduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void containsDuplicate() {
        var solution = new Solution();

        int[] nums = new int[]{1, 2, 2, 3};
        assertTrue(solution.containsDuplicate(nums));

        nums = new int[]{1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));

        nums = new int[]{3, 4, 5, 6, 7, 3};
        assertTrue(solution.containsDuplicate(nums));
    }
}
