package org.example.array.productofarrayexceptitself;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void productExceptSelf(int[] expected, int[] given) {
        var solution = new Solution();

        var actual = solution.productExceptSelf(given);

        assertArrayEquals(expected, actual);
    }

    public static Stream<Arguments> productExceptSelf() {
        return Stream.of(
                arguments(new int[]{24, 12, 8, 6}, new int[]{1, 2, 3, 4}),
                arguments(new int[]{0, 0, 9, 0, 0}, new int[]{-1, 1, 0, -3, 3})
        );
    }
}