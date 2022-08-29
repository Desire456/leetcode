package org.example.array.rotatearray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @SuppressWarnings("ConstantConditions")
    @Test
    public void rotate() {
        var solution = new Solution();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);

        nums = new int[]{1, 2, 3};
        k =  2;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{2, 3, 1}, nums);

        nums = new int[]{-1, -100, 3, 99};
        k = 2;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);

        nums = new int[]{1, 2};
        k = 2;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{1, 2}, nums);

        nums = new int[]{1, 2};
        k = 3;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{2, 1}, nums);
    }
}
