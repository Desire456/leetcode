package org.example.other.hammingdistance;

public class Solution {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return hammingCount(xor);
    }

    private int hammingCount(int x) {
        int count = 0;

        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((x & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }

        return count;
    }
}
