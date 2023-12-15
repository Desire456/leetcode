package org.example.sortingandsearching.search2dmatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var n = matrix.length;
        var m = matrix[0].length;

        var left = 0;
        var right = n * m - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            var idx = to2DIndex(mid, m);
            var midVal = matrix[idx[0]][idx[1]];
            if (midVal == target) {
                return true;
            } else if (midVal > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    private int[] to2DIndex(int index, int m) {
        return new int[]{index / m, index % m};
    }
}
