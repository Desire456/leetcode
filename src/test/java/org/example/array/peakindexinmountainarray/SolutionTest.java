package org.example.array.peakindexinmountainarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("arrayToPeakIndex")
    void peakIndexInMountainArray(int[] arr, int expected) {
        var solution = new Solution();

        var actual = solution.peakIndexInMountainArray(arr);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> arrayToPeakIndex() {
        return Stream.of(
                arguments(new int[]{0, 1, 0}, 1),
                arguments(new int[]{0, 2, 1, 0}, 1),
                arguments(new int[]{0, 10, 5, 2}, 1)
        );
    }
}