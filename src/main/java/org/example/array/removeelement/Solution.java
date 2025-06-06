package org.example.array.removeelement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        var n = nums.length;
        var j = 0;
        for (var i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
