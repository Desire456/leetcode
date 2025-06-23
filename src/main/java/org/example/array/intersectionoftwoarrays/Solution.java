package org.example.array.intersectionoftwoarrays;

import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        var result = new HashSet<Integer>();
        for (var num1 : nums1) {
            set1.add(num1);
        }

        for (var num2 : nums2) {
            if (set1.contains(num2)) {
                result.add(num2);
            }
        }

        var res = new int[result.size()];
        var i = 0;
        for (var num : result) {
            res[i++] = num;
        }
        return res;
    }
}
