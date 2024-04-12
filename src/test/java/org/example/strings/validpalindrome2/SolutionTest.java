package org.example.strings.validpalindrome2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "aba, true",
            "abca, true",
            "abc, false"
    })
    void validPalindrome(String input, boolean expected) {
        var solution = new Solution();

        var actual = solution.validPalindrome(input);

        assertEquals(expected, actual);
    }
}