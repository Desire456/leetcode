package org.example.array.reversevowelsofastring;

public class Solution {
    public String reverseVowels(String s) {
        if (s.length() == 1) {
            return s;
        }
        var l = 0;
        var r = s.length() - 1;
        var reversed = new char[s.length()];
        while (l <= r) {
            while (l <= r && !isVowel(s.charAt(l))) {
                reversed[l] = s.charAt(l);
                l++;
            }

            while (l <= r && !isVowel(s.charAt(r))) {
                reversed[r] = s.charAt(r);
                r--;
            }

            if (l <= r) {
                reversed[l] = s.charAt(r);
                reversed[r] = s.charAt(l);
                l++;
                r--;
            }
        }

        return new String(reversed);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
    }
}
