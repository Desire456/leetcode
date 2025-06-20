package org.example.array.longestsubsequencewithlimitedsum;

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            res[i] = search(nums, queries[i]);
        }

        return res;
    }

    private int search(int[] nums, int find) {
        var l = 0;
        var r = nums.length - 1;
        var m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == find) {
                return m + 1;
            } else if (nums[m] < find) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r + 1;
    }
}
