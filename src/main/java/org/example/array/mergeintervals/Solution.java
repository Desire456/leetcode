package org.example.array.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        var res = new LinkedList<int[]>();
        res.add(intervals[0]);

        for (var right : intervals) {
            var left = res.getLast();
            if (right[0] > left[1]) {
                res.add(right);
            } else {
                left[1] = Math.max(right[1], left[1]);
            }
        }
        return res.toArray(int[][]::new);
    }
}
