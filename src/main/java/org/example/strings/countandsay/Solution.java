package org.example.strings.countandsay;

public class Solution {

    public String countAndSay(int n) {
        var prev = "11";
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return prev;
        }

        var ans = new StringBuilder();
        for (int i = 3; i <= n; ++i) {
            char[] chars = prev.toCharArray();
            int counter = 1;
            for (int j = 1; j < chars.length; ++j) {
                if (chars[j - 1] != chars[j]) {
                    ans.append(counter).append(chars[j - 1]);
                    counter = 1;
                } else {
                    counter++;
                }
            }
            ans.append(counter).append(chars[chars.length - 1]);
            prev = ans.toString();
            ans = new StringBuilder();
        }

        return prev;
    }
}
