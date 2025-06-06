package org.example.array.majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void majorityElement() {
        var solution = new Solution();

        var actual = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

        assertEquals(2, actual);
    }
}
