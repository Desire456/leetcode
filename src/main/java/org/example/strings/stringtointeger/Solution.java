package org.example.strings.stringtointeger;

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i == s.length()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            ++i;
        }

        int result = 0;
        while (i < s.length() && s.charAt(i) <= '9' && s.charAt(i) >= '0') {
            var digit = s.charAt(i) - '0';
            //result = result * 10 + digit
            //result * 10 + digit >= Integer.MAX_VALUE (condition for overlow)
            //result >= (Integer.MAX_VALUE - digit) / 10 (overflow)
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}