package org.example.array.threesum;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void threeSum() {
        var solution = new Solution();

        var testCases = List.of(testCase1(), testCase2(), testCase3());
        for (var testCase : testCases) {
            assertEquals(testCase.getLeft(), solution.threeSum(testCase.getRight()));
        }
    }

    private Pair<List<List<Integer>>, int[]> testCase1() {
        return new ImmutablePair<>(
                List.of(
                        List.of(-1, -1, 2),
                        List.of(-1, 0, 1)
                ),
                new int[]{-1, 0, 1, 2, -1, -4}
        );
    }

    private Pair<List<List<Integer>>, int[]> testCase2() {
        return new ImmutablePair<>(
                List.of(),
                new int[]{0, 1, 1}
        );
    }

    private Pair<List<List<Integer>>, int[]> testCase3() {
        return new ImmutablePair<>(
                List.of(
                        List.of(0, 0, 0)
                ),
                new int[]{0, 0, 0}
        );
    }
}
