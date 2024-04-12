package org.example.strings.validpalindrome2;

public class Solution {

    public boolean validPalindrome(String s) {
        var n = s.length();
        var l = 0;
        var r = n - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
                continue;
            }

            return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
        }

        return true;
    }

    private boolean validPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
