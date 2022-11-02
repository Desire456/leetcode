package org.example.other.missingnumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n + 1) * n / 2;
        int realSum = 0;
        for (int num : nums) {
            realSum += num;
        }
        return sum - realSum;
    }
}
