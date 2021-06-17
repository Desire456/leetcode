package com.company.hashtable.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> sums = new HashSet<>();
        while (sum != 1) {
            while (n > 0) {
                int d = n % 10;
                sum += (d * d);
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else if (sums.contains(sum)) {
                return false;
            }
            sums.add(sum);
            n = sum;
            sum = 0;
        }
        return false;
    }
}
