package org.example.sortingandsearching.topkfrequent;

import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (var num : nums) {
            map.compute(num, (key, v) -> v == null ? 1 : v + 1);
        }

        var buckets = new ArrayList<Set<Integer>>(Collections.nCopies(nums.length + 1, null));
        for (var num : nums) {
            Set<Integer> bucket;
            var count = map.get(num);
            if (buckets.get(count) == null) {
                bucket = new HashSet<>();
                buckets.set(count, bucket);
            } else {
                bucket = buckets.get(count);
            }
            bucket.add(num);
        }

        var ans = new ArrayList<Integer>();
        for (var i = nums.length; k > 0 && i >= 0; --i) {
            var bucket = buckets.get(i);
            if (bucket == null) {
                continue;
            }

            var iter = bucket.iterator();
            while (k > 0 && iter.hasNext()) {
                ans.add(iter.next());
                k--;
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
