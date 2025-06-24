package org.example.strings.shortestdistancetoacharacter;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        var n = s.length();
        var res = new int[n];
        var pos = -100000;
        for (var i = 0; i < n; ++i) {
            if (s.charAt(i) != c) {
                res[i] = i - pos;
            } else {
                pos = i;
            }
        }

        for (var i = n - 1; i >= 0; --i) {
            if (s.charAt(i) != c) {
                res[i] = Math.min(Math.abs(i - pos), res[i]);
            } else {
                pos = i;
            }
        }
        return res;
    }
}
