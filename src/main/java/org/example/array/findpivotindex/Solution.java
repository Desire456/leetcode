package org.example.array.findpivotindex;

public class Solution {
    public int pivotIndex(int[] nums) {
        var n = nums.length;
        var sum = new int[n];
        sum[0] = nums[0];
        for (var i = 1; i < n; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }

        if (sum[n - 1] - sum[0] == 0) {
            return 0;
        }
        for (var pivot = 1; pivot < n - 1; ++pivot) {
            if (sum[pivot - 1] == sum[n - 1] - sum[pivot]) {
                return pivot;
            }
        }
        if (sum[n - 2] == 0) {
            return n - 1;
        }


        return -1;
    }
}
