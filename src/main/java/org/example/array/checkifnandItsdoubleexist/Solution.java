package org.example.array.checkifnandItsdoubleexist;

import java.util.HashSet;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        var set = new HashSet<Integer>();
        for (var num : arr) {
            if (set.contains(num)) {
                return true;
            }
            if (num % 2 == 0) {
                set.add(num / 2);
            }
            set.add(num * 2);
        }

        return false;
    }
}
