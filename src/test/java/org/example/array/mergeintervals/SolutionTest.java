package org.example.array.mergeintervals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void merge(int[][] intervals, int[][] expected) {
        var solution = new Solution();

        var actual = solution.merge(intervals);

        assertArrayEquals(expected, actual);
    }

    public static Stream<Arguments> merge() {
        return Stream.of(
                arguments(
                        new int[][]{
                                new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}
                        },
                        new int[][]{
                                new int[]{1, 6}, new int[]{8, 10}, new int[]{15, 18}
                        }
                ),
                arguments(
                        new int[][]{
                                new int[]{1, 4}, new int[]{4, 5}
                        },
                        new int[][]{
                                new int[]{1, 5}
                        }
                )
        );
    }
}