package org.example.array.setmatrixzeroes;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void setZeroes(Pair<int[][], int[][]> testCase) {
        var matrix = testCase.getRight();
        solution.setZeroes(matrix);
        assertArrayEquals(testCase.getLeft(), matrix);
    }

    private static List<Pair<int[][], int[][]>> testCases() {
        return List.of(
                Pair.of(
                        new int[][]{
                                {1, 0, 1},
                                {0, 0, 0},
                                {1, 0, 1}
                        },
                        new int[][]{
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1}
                        }
                ),
                Pair.of(
                        new int[][]{
                                {0, 0, 0, 0},
                                {0, 4, 5, 0},
                                {0, 3, 1, 0}
                        },
                        new int[][]{
                                {0, 1, 2, 0},
                                {3, 4, 5, 2},
                                {1, 3, 1, 5}
                        }
                )
        );
    }
}
