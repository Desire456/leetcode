package org.example.math.countprimes;

import java.util.Arrays;

public class Solution {

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        int count = n - 2;

        for (int i = 2; i * i < n; ++i) {
            if (!prime[i * i]) {
                continue;
            }

            for (int j = i * i; j < n; j += i) {
                if (prime[j]) {
                    prime[j] = false;
                    count--;
                }
            }
        }

        return count;
    }
}
