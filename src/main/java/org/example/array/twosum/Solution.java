package org.example.array.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (differences.containsKey(nums[i])) {
                return new int[]{differences.get(nums[i]), i};
            }
            var difference = target - nums[i];
            differences.put(difference, i);
        }
        throw new RuntimeException();
    }
}
