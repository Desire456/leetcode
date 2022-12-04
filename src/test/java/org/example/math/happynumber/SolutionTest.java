package org.example.math.happynumber;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void isHappy(Pair<Boolean, Integer> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.isHappy(testCase.getRight()));
    }

    private static List<Pair<Boolean, Integer>> testCases() {
        return List.of(
                Pair.of(
                        true, 19
                ),
                Pair.of(
                        false, 2
                ),
                Pair.of(
                        true, 1
                )
        );
    }
}
