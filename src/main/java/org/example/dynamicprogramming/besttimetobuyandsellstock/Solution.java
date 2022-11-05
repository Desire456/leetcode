package org.example.dynamicprogramming.besttimetobuyandsellstock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int maxProfit = 0;
        int minVal = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minVal) {
                minVal = price;
            } else if (price - minVal > maxProfit) {
                maxProfit = price - minVal;
            }
        }
        return maxProfit;
    }
}
