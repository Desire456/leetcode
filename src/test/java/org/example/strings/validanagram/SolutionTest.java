package org.example.strings.validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isAnagram() {
        var solution = new Solution();

        var s = "anagram";
        var t = "nagaram";
        assertTrue(solution.isAnagram(s, t));

        s = "rat";
        t = "car";
        assertFalse(solution.isAnagram(s, t));
    }
}
