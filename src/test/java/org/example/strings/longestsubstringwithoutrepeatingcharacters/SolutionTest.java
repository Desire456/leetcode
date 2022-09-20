package org.example.strings.longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        var solution = new Solution();

        var s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));

        s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));

        s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }
}
