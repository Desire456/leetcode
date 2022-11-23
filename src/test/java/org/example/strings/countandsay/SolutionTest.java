package org.example.strings.countandsay;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void countAndSay(Pair<String, Integer> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.countAndSay(testCase.getRight()));
    }

    private static List<Pair<String, Integer>> testCases() {
        return List.of(
                Pair.of(
                        "1", 1
                ),
                Pair.of(
                        "11", 2
                ),
                Pair.of(
                        "21", 3
                ),
                Pair.of(
                        "1211", 4
                )
        );
    }
}
