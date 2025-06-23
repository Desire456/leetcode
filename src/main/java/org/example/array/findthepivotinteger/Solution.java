package org.example.array.findthepivotinteger;

public class Solution {
    public int pivotInteger(int n) {
        var sum = new int[n + 1];
        for (var i = 1; i <= n; ++i) {
            sum[i] = i + sum[i - 1];
        }

        for (var i = 1; i < n + 1; i++) {
            if (sum[i] == sum[n] - sum[i - 1]) {
                return i;
            }
        }

        return -1;
    }
}
