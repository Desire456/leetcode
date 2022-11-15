package org.example.array.groupanagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return List.of();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String str = new String(chArr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
