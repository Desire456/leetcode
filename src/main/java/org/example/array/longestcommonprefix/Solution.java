package org.example.array.longestcommonprefix;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        var m = strs.length - 1;
        var n = strs[0].length();
        var i = 0;
        for (; i < n; i++) {
            if (strs[0].charAt(i) != strs[m].charAt(i)) {
                break;
            }
        }

        return strs[0].substring(0, i);
    }
}
