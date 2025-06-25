package org.example.array.faircandyswap;

import java.util.HashMap;

public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        var aliceSum = 0;
        for (var aliceSize : aliceSizes) {
            aliceSum += aliceSize;
        }

        var bobSum = 0;
        for (var bobSize : bobSizes) {
            bobSum += bobSize;
        }

        var map = new HashMap<Integer, Integer>();
        for (var aliceSize : aliceSizes) {
            map.put((bobSum - aliceSum + 2 * aliceSize) / 2, aliceSize);
        }

        for (var bobSize : bobSizes) {
            if (map.containsKey(bobSize)) {
                return new int[]{map.get(bobSize), bobSize};
            }
        }

        return new int[]{};
    }
}
