package org.example.strings.longestsubstringwithoutrepeatingcharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int result = 1;
        List<Character> substring = new ArrayList<>();

        while (r < s.length()) {
            while (substring.contains(s.charAt(r))) {
                result = Math.max(result, r - l);
                substring.remove(0);
                l++;
            }
            substring.add(s.charAt(r));
            r++;
        }
        return result;
    }
}
