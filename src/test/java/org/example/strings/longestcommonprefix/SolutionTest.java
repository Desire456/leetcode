package org.example.strings.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        var solution = new Solution();

        var strs = new String[]{"flower","flow","flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));

        strs = new String[]{"flower", "flower", "flower"};
        assertEquals("flower", solution.longestCommonPrefix(strs));

        strs = new String[]{"a", "b"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }
}
