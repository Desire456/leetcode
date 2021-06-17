package com.company.array.removeduplicates;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] array = new int[integers.size()];
        for(int i = 0; i < array.length; ++i) {
            array[i] = integers.get(i);
        }
        System.out.println(solution.removeDuplicates(array));
    }
}
