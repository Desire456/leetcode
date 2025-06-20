package org.example.array.findthehighestaltitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        var sum = 0;
        var alt = 0;
        for (var num : gain) {
            sum += num;
            alt = Math.max(alt, sum);
        }
        return alt;
    }
}
