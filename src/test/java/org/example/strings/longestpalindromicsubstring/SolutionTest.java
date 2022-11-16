package org.example.strings.longestpalindromicsubstring;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void longestPalindrome(Pair<String, String> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.longestPalindrome(testCase.getRight()));
    }

    private static List<Pair<String, String>> testCases() {
        return List.of(
                Pair.of(
                        "aba",
                        "babad"
                ),
                Pair.of(
                        "bb",
                        "cbbd"
                ),
                Pair.of(
                        "racecar",
                        "racecar"
                )
        );
    }
}
