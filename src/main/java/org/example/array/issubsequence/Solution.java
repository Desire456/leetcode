package org.example.array.issubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        var i = 0;
        var j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == s.length();
    }
}
