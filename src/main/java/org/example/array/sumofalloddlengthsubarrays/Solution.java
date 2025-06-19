package org.example.array.sumofalloddlengthsubarrays;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        var n = arr.length;
        var sum = new int[n];
        sum[0] = arr[0];
        for (var i = 1; i < n; ++i) {
            sum[i] = arr[i] + sum[i - 1];
        }

        var res = 0;
        for (var i = 1; i <= n; i += 2) {
            for (var j = 0; j < (n - i + 1); ++j) {
                var diff = j > 0 ? sum[j - 1] : 0;
                res += sum[j + i - 1] - diff;
            }
        }
        return res;
    }
}
