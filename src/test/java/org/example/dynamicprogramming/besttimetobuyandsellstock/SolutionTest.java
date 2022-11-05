package org.example.dynamicprogramming.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void maxProfit() {
        var solution = new Solution();

        var prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }
}
