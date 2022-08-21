package org.example.array.removeduplicates;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">Task on leetcode</a>
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int duplicateNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != duplicateNum) {
                nums[++k] = nums[i];
                duplicateNum = nums[i];
            }
        }
        return ++k;
    }
}
