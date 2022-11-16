package org.example.strings.longestpalindromicsubstring;

public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }

        int l = 0;
        int r = 0;
        for (int i = 0; i < n - 1; ++i) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > r - l) {
                l = i - ((len - 1) / 2);
                r = i + (len / 2);
            }
        }

        return s.substring(l, r + 1);
    }

    private int expandAroundCenter(String s, int l, int r) {
        int n = s.length();

        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }
}
