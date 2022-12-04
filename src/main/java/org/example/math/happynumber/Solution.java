package org.example.math.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (true) {
            int sum = sumOfSquaredDigits(n);
            if (sum == 1) {
                return true;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
    }

    public int sumOfSquaredDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
