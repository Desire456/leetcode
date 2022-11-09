package org.example.sortingandsearching.sortcolors;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void sortColors(Pair<int[], int[]> testCase) {
        var solution = new Solution();

        var nums = testCase.getRight();
        solution.sortColors(nums);

        assertArrayEquals(testCase.getLeft(), nums);
    }

    private static List<Pair<int[], int[]>> testCases() {
        return List.of(
                Pair.of(
                        new int[]{0, 0, 1, 1, 2, 2},
                        new int[]{2, 0, 2, 1, 1, 0}
                ),
                Pair.of(
                        new int[]{0, 1, 2},
                        new int[]{2, 0, 1}
                ),
                Pair.of(
                        new int[]{1, 1},
                        new int[]{1, 1}
                )
        );
    }
}
