package org.example.array.validperfectsquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        var lo = 1;
        var hi = num;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long mid2 = (long) mid * mid;
            if (mid2 == num) {
                return true;
            } else if (mid2 > num) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return false;
    }
}
