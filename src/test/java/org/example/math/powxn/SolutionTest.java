package org.example.math.powxn;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void myPow(Pair<Double, Pair<Double, Integer>> testCase) {
        var expected = testCase.getLeft();
        var given = testCase.getRight();
        assertEquals(expected, SOLUTION.myPow(given.getLeft(), given.getRight()));
    }

    private static List<Pair<Double, Pair<Double, Integer>>> testCases() {
        return List.of(
                Pair.of(
                        1024.,
                        Pair.of(2., 10)
                ),
                Pair.of(
                        9.261000000000001,
                        Pair.of(2.1, 3)
                ),
                Pair.of(
                        0.25,
                        Pair.of(2., -2)
                )
        );
    }
}
