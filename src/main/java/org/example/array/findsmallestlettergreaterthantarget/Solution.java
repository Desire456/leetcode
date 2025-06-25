package org.example.array.findsmallestlettergreaterthantarget;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        var n = letters.length;
        var lo = 0;
        var hi = n - 1;
        while (lo <= hi) {
            var mid = lo + (hi - lo) / 2;
            if (letters[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo == n ? letters[0] : letters[lo];
    }
}
