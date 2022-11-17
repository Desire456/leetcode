package org.example.array.increasingtripletsubsequence;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void increasingTriplet(Pair<Boolean, int[]> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.increasingTriplet(testCase.getRight()));
    }

    private static List<Pair<Boolean, int[]>> testCases() {
        return List.of(
                Pair.of(
                        true,
                        new int[]{1, 2, 3, 4, 5}
                ),
                Pair.of(
                        false,
                        new int[]{5, 4, 3, 2, 1}
                ),
                Pair.of(
                        true,
                        new int[]{2, 1, 5, 0, 4, 6}
                )
        );
    }
}
