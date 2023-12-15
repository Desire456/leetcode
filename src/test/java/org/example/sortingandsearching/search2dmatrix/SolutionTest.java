package org.example.sortingandsearching.search2dmatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void searchMatrix(int[][] matrix, int target, boolean expected) {
        var solution = new Solution();

        var actual = solution.searchMatrix(matrix, target);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> searchMatrix() {
        return Stream.of(
                arguments(
                        new int[][]{
                                new int[]{1, 3, 5, 7},
                                new int[]{10, 11, 16, 20},
                                new int[]{23, 30, 34, 60}
                        },
                        3,
                        true
                ),
                arguments(
                        new int[][]{
                                new int[]{1, 3, 5, 7},
                                new int[]{10, 11, 16, 20},
                                new int[]{23, 30, 34, 60}
                        },
                        13,
                        false
                )
        );
    }
}