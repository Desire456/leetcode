package org.example.other.hammingdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void hammingDistance() {
        var solution = new Solution();

        assertEquals(2, solution.hammingDistance(1, 4));
        assertEquals(1, solution.hammingDistance(3, 1));
    }
}
