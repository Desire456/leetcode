package org.example.sortingandsearching.findclosestnumbertozero;

public class Solution {
    public int findClosestNumber(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            if (Math.abs(num) <= Math.abs(result)) {
                if (!(Math.abs(num) == result && num < 0)) {
                    result = num;
                }
            }
        }
        return result;
    }
}
