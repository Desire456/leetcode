package org.example.array.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @SuppressWarnings({"ConstantConditions"})
    @Test
    public void twoSum() {
        var solution = new Solution();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));

        nums = new int[]{3, 3};
        target = 6;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }
}
