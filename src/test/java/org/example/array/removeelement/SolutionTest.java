package org.example.array.removeelement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void removeElement(
            int[] nums,
            int val,
            int expected
    ) {
        var solution = new Solution();

        var actual = solution.removeElement(nums, val);

        assertEquals(expected, actual);
    }

    private static Stream<Arguments> removeElement() {
        return Stream.of(
                arguments(new int[]{3, 2, 2, 3}, 3, 2),
                arguments(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }
}
