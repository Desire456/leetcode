package org.example.array.productofarrayexceptitself;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        var result = new int[n];
        var prefix = 1;
        var suffix = 1;

        for (var i = 0; i < n; ++i) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        for (var i = n - 1; i >= 0; --i) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
