package org.example.array.maximumpopulationyear;

public class Solution {

    public int maximumPopulation(int[][] logs) {
        var years = new int[101];
        for (var log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        for (var i = 1; i < 101; ++i) {
            years[i] += years[i - 1];
        }

        var count = 0;
        var res = 0;
        for (var i = 0; i < 101; ++i) {
            if (years[i] > count) {
                count = years[i];
                res = i;
            }
        }

        return res + 1950;
    }
}
