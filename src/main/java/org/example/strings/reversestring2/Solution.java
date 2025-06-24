package org.example.strings.reversestring2;

public class Solution {
    public String reverseStr(String s, int k) {
        var i = 0;
        var rev = s.toCharArray();
        while (2 * i * k < s.length()) {
            var l = 2 * i * k;
            var r = Math.min(l + k - 1, s.length() - 1);
            while (l < r) {
                var tmp = rev[l];
                rev[l] = rev[r];
                rev[r] = tmp;
                r--;
                l++;
            }

            i++;
        }
        return new String(rev);
    }
}
