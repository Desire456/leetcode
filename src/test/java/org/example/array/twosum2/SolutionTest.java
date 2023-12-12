package org.example.array.twosum2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void twoSum(int[] expected, int[] numbers, int target) {
        var solution = new Solution();

        var actual = solution.twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    public static Stream<Arguments> twoSum() {
        return Stream.of(
                arguments(new int[]{1, 2}, new int[]{2, 7, 11, 15}, 9),
                arguments(new int[]{1, 3}, new int[]{2, 3, 4}, 6),
                arguments(new int[]{1, 2}, new int[]{-1, 0}, -1)
        );
    }
}