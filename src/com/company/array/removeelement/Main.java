package com.company.array.removeelement;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] array = new int[integers.size() - 1];
        for (int i = 0; i < array.length; ++i) {
            array[i] = integers.get(i);
        }
        int val = integers.get(integers.size() - 1);

        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(array, val));
        System.out.println(Arrays.toString(array));
    }
}
