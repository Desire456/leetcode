package org.example.array.countnegativenumbersinasortedmatrix;

public class Solution {
    public int countNegatives(int[][] grid) {
        var m = grid.length;
        var n = grid[0].length;
        var row = 0;
        var col = n - 1;
        var res = 0;
        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                res += (m - row);
                col--;
            } else {
                row++;
            }
        }

        return res;
    }
}
