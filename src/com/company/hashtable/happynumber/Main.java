package com.company.hashtable.happynumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.isHappy(n));
    }
}
