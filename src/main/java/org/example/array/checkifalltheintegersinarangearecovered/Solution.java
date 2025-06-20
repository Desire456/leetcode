package org.example.array.checkifalltheintegersinarangearecovered;

public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        var arr = new int[52];
        for (var range : ranges) {
            arr[range[0]]++;
            arr[range[1] + 1]--;
        }

        for (var i = 1; i < 52; ++i) {
            arr[i] += arr[i - 1];
        }

        var i = left;
        while (i <= right) {
            if (arr[i++] == 0) {
                return false;
            }
        }

        return true;
    }
}
