package org.example.array.rangesumquery;

public class NumArray {

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length];
        sum[0] = nums[0];
        for (var i = 1; i < nums.length; ++i) {
            sum[i] = nums[i] + sum[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sum[right];
        }

        return sum[right] - sum[left - 1];
    }
}
