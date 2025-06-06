package org.example.array.longestcommonprefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void longestCommonPrefix(
            String[] strs,
            String expected
    ) {
        var solution = new Solution();

        var actual = solution.longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

    private static Stream<Arguments> longestCommonPrefix() {
        return Stream.of(
                arguments(new String[]{"flower", "flow", "flight"}, "fl"),
                arguments(new String[]{"dog", "racecar", "car"}, "")
        );
    }
}
