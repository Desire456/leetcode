package org.example.array.besttimetobuyandsellstock2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void maxProfit() {
        var solution = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, solution.maxProfit(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        assertEquals(4, solution.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));

        prices = new int[]{1, 7, 2, 3, 6, 7, 6, 7};
        assertEquals(12, solution.maxProfit(prices));
    }
}
