package com.company.string.longestpalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        int startPos = 0;
        int endPos = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = palindromeLength(s, i, i);
            int length2 = palindromeLength(s, i, i + 1);
            int length = Math.max(length1, length2);
            if (length > endPos - startPos) {
                startPos = i - (length - 1) / 2;
                endPos = i + length / 2;
            }
        }
        return s.substring(startPos, endPos + 1);
    }

    private int palindromeLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
