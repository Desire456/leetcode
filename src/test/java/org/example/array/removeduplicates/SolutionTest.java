package org.example.array.removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        int k = new Solution().removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
