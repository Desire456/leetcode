package org.example.array.findthedistancevaluebetweentwoarrays;

import java.util.Arrays;

public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        var counter = 0;
        for (var num : arr1) {
            var min = num - d;
            var max = num + d;
            var found = search(arr2, min, max);
            if (found == -1) {
                counter++;
            }
        }
        return counter;
    }

    private int search(int[] arr, int min, int max) {
        var lo = 0;
        var hi = arr.length - 1;
        while (lo <= hi) {
            var mid = lo + (hi - lo) / 2;
            if (arr[mid] < min) {
                lo = mid + 1;
            } else if (arr[mid] > max) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
