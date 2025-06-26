package org.example.array.thekweakestrowsinamatrix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        for (var i = 0; i < mat.length; ++i) {
            var count = search(mat[i]);
            mat[i] = new int[]{count, i};
        }
        Arrays.sort(mat, Comparator.comparingInt(o -> o[0]));

        var res = new int[k];
        var i = 0;
        while (i < k) {
            res[i] = mat[i][1];
            i++;
        }
        return res;
    }

    public int search(int[] arr) {
        var n = arr.length;
        var lo = 0;
        var hi = n - 1;
        while (lo <= hi) {
            var mid = lo + (hi - lo) / 2;
            if (arr[mid] == 1) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi + 1;
    }
}
