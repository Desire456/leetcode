package org.example.array.sortarray;

public class Solution {

    public int[] sortArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public int[] helper(int[] arr, int l, int r) {
        if (l == r) {
            return arr;
        }

        var m = (l + r) / 2;
        helper(arr, l, m);
        helper(arr, m + 1, r);

        var left = new int[m - l + 1];
        System.arraycopy(arr, l, left, 0, left.length);
        var right = new int[r - m];
        System.arraycopy(arr, m + 1, right, 0, right.length);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }
}
