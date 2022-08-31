package org.example.strings.firstuniquecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void firstUniqChar() {
        var solution = new Solution();

        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
        assertEquals(-1, solution.firstUniqChar("aabb"));
        assertEquals(-1, solution.firstUniqChar("acaadcad"));
    }
}
