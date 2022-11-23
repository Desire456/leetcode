package org.example.array.missingranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int low = lower;
        int n = nums.length;

        if (lower < nums[0]) {
            result.add(getRange(low, nums[0] - 1));
        }
        low = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] - low > 1) {
                result.add(getRange(low + 1, nums[i] - 1));
            }
            low = nums[i];
        }

        if (upper - low > 1) {
            result.add(getRange(low + 1, upper));
        }
        return result;
    }

    private String getRange(int low, int up) {
        return low == up ? String.valueOf(low) : String.format("%d->%d", low, up);
    }
}
