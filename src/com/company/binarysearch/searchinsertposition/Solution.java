package com.company.binarysearch.searchinsertposition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        while (true) {
            if (nums[middle] == target) {
                return middle;
            }
            if (target > nums[middle]) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
            if (right - left < 0) {
                int pos = left < 0 ? left + 1 : left;
                pos = pos > nums.length - 1 ? pos - 1 : pos;
                return target > nums[pos] ? pos + 1 : pos;
            }
            middle = (left + right) / 2;
        }
    }
}
