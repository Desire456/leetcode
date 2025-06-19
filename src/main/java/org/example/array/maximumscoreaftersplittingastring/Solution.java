package org.example.array.maximumscoreaftersplittingastring;

public class Solution {
    public int maxScore(String s) {
        var n = s.length();
        var s1 = new int[n];
        s1[0] = s.charAt(0) == '0' ? 1 : 0;
        for (var i = 1; i < n - 1; ++i) {
            s1[i] = s1[i - 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        var s2 = new int[n];
        s2[0] = s.charAt(0) == '1' ? 1 : 0;
        for (var i = 1; i < n; ++i) {
            s2[i] = s2[i - 1] + (s.charAt(i) == '1' ? 1 : 0);
        }

        var pivot = 0;
        var res = 0;
        for (; pivot < n - 1; pivot++) {
            res = Math.max(res, s1[pivot] + s2[n - 1] - s2[pivot]);
        }
        return res;
    }
}
