package org.example.array.concatenationofarray;

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
    void getConcatenation(int[] nums, int[] expected) {
        var actual = solution.getConcatenation(nums);

        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> getConcatenation() {
        return Stream.of(
                arguments(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                arguments(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1})
        );
    }
}
