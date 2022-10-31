package org.example.other.reversebits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void reverseBits() {
        var solution = new Solution();

        assertEquals(964176192, solution.reverseBits(43261596));
        assertEquals(-1073741825, solution.reverseBits(-3));
    }
}
