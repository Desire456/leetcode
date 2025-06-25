package org.example.array.arrangingcoins;

public class Solution {
    public int arrangeCoins(int n) {
        var lo = 1;
        var hi = n;
        while (lo <= hi) {
            var mid = lo + (hi - lo) / 2;
            long x = mid * (long) (mid + 1) / 2;
            if (x == n) {
                return mid;
            } else if (x > n) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return hi;
    }
}
