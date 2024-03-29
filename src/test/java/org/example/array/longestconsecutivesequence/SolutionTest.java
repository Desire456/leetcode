package org.example.array.longestconsecutivesequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource
    void longestConsecutive(int[] nums, int expected) {
        var actual = solution.longestConsecutive(nums);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> longestConsecutive() {
        return Stream.of(
                arguments(new int[]{100, 4, 200, 1, 3, 2}, 4),
                arguments(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9)
        );
    }
}
