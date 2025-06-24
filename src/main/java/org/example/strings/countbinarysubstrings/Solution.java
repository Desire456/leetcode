package org.example.strings.countbinarysubstrings;

public class Solution {
    public int countBinarySubstrings(String s) {
        var prev = 0;
        var cur = 1;
        var res = 0;
        for (var i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
            } else {
                res += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }
        }

        return res + Math.min(prev, cur);
    }
}
