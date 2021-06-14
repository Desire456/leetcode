package com.company.string.longestpalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(longestPalindrome.longestPalindrome(input));
    }
}
