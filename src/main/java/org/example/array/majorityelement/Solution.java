package org.example.array.majorityelement;

public class Solution {
    public int majorityElement(int[] nums) {
        var cand = nums[0];
        var c = 0;
        for (var num : nums) {
            if (c == 0) {
                cand = num;
                c++;
                continue;
            }
            c += (cand == num ? 1 : -1);
        }
        return cand;
    }
}
