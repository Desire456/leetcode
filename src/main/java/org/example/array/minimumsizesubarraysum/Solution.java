package org.example.array.minimumsizesubarraysum;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                result = Math.min(r - l + 1, result);
                sum -= nums[l];
                l++;
            }
            r++;
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
