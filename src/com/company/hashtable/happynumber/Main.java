package com.company.hashtable.happynumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(n));
    }
}
