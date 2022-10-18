package org.example.math.countprimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void countPrimes() {
        var solution = new Solution();

        assertEquals(0, solution.countPrimes(0));
        assertEquals(0, solution.countPrimes(1));
        assertEquals(2, solution.countPrimes(5));
        assertEquals(4, solution.countPrimes(10));
        assertEquals(6, solution.countPrimes(17));
    }
}
