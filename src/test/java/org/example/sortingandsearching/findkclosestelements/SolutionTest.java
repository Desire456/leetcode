package org.example.sortingandsearching.findkclosestelements;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void findClosestElements() {
        var solution = new Solution();

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        assertEquals(List.of(1, 2, 3, 4), solution.findClosestElements(arr, k, x));

        arr = new int[]{1, 2, 3, 4, 5};
        k = 4;
        x = -1;
        assertEquals(List.of(1, 2, 3, 4), solution.findClosestElements(arr, k, x));
    }
}
