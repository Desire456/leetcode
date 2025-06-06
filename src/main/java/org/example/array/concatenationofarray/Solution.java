package org.example.array.concatenationofarray;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        var n = nums.length;
        var res = new int[2 * n];
        var i = 0;
        for (var num : nums) {
            res[i++] = num;
        }

        for (var j = 0; i < res.length; ++j, ++i) {
            res[i] = nums[j];
        }

        return res;
    }
}
