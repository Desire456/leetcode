package org.example.array.besttimetobuyandsellstock2;

public class Solution {
    public int maxProfit(int[] prices) {
        int valley;
        int peak;
        int profit = 0;
        int i = 0;

        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) {
                ++i;
            }
            valley = prices[i];

            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) {
                ++i;
            }
            peak = prices[i];

            profit += peak - valley;
            ++i;
        }

        return profit;
    }
}
