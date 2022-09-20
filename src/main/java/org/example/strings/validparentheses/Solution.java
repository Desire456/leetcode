package org.example.strings.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> chars = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case '(', '{', '[' -> chars.push(s.charAt(i));
                case ')' -> {
                    if (chars.isEmpty() || chars.pop() != '(') {
                        return false;
                    }
                }
                case '}' -> {
                    if (chars.isEmpty() || chars.pop() != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (chars.isEmpty() || chars.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
