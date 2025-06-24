package org.example.array.flippinganimage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        var n = image.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < (n + 1) / 2; j++) {
                var tmp = invert(image[i][j]);
                image[i][j] = invert(image[i][n - 1 - j]);
                image[i][n - 1 - j] = tmp;
            }
        }

        return image;
    }

    private int invert(int n) {
        return n == 1 ? 0 : 1;
    }
}
