package org.example.dynamicprogramming.maximumsubarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = maxSum;

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i] + currSum, nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
