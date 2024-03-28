package org.example.array.longestconsecutivesequence;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        var set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        var result = 1;

        for (var num : set) {
            var length = 1;
            if (set.contains(num - 1)) {
                continue;
            }

            var numCopy = num;
            while (set.contains(++numCopy)) {
                length++;
            }

            result = Math.max(result, length);
        }


        return result;
    }
}
