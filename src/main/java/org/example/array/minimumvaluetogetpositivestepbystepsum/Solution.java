package org.example.array.minimumvaluetogetpositivestepbystepsum;

public class Solution {
    public int minStartValue(int[] nums) {
        var n = 0;
        var res = 0;
        for (var num : nums) {
            n += num;
            res = Math.min(res, n);
        }
        return 1 - res;
    }
}
