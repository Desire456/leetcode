package org.example.strings.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }

        int ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        for (int i = 0, j = 0; j < n; ++j) {
            var ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1);
            }
            map.put(ch, j);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
