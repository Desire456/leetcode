package org.example.sortingandsearching.topkfrequent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource
    public void topKFrequent(int[] nums, int k, int[] expected) {
        assertArrayEquals(expected, solution.topKFrequent(nums, k));
    }

    private static Stream<Arguments> topKFrequent() {
        return Stream.of(
                arguments(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}),
                arguments(new int[]{1}, 1, new int[]{1})
        );
    }
}