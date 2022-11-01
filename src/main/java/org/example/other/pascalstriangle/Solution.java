package org.example.other.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        if (numRows == 1) {
            return result;
        }

        for (int i = 1; i < numRows; ++i) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> curr = new ArrayList<>(i + 1);
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}
