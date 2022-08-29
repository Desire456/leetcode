package org.example.array.intersectionoftwoarrays2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void intersect() {
        var solution = new Solution();

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        assertArrayEquals(new int[]{2, 2}, solution.intersect(nums1, nums2));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        assertArrayEquals(new int[]{4, 9}, solution.intersect(nums1, nums2));
    }
}
