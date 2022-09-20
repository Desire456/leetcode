package org.example.sortingandsearching.findclosestnumber;

import org.example.sortingandsearching.findclosestnumbertozero.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void findClosestNumber() {
        var solution = new Solution();

        int[] nums = new int[]{-4, -2, 1, 4, 8};
        assertEquals(1, solution.findClosestNumber(nums));

        nums = new int[]{2, -1, 1};
        assertEquals(1, solution.findClosestNumber(nums));
    }
}
