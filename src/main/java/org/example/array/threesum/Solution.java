package org.example.array.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    low++;
                    while (low < high && nums[low] == nums[low - 1]) low++;

                    high--;
                    while (low < high && nums[high] == nums[high + 1]) high--;
                } else if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }
}
