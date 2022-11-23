package org.example.array.missingranges;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void findMissingRanges(Pair<List<String>, Triple<int[], Integer, Integer>> testCase) {
        var given = testCase.getRight();

        var expected = testCase.getLeft();
        var actual = SOLUTION.findMissingRanges(given.getLeft(), given.getMiddle(), given.getRight());

        assertEquals(expected, actual);
    }

    private static List<Pair<List<String>, Triple<int[], Integer, Integer>>> testCases() {
        return List.of(
                Pair.of(
                        List.of("2", "4->49", "51->74", "76->99"),
                        Triple.of(
                                new int[]{0, 1, 3, 50, 75},
                                0,
                                99
                        )
                ),
                Pair.of(
                        List.of("-100->-1", "2", "4->49", "51->74"),
                        Triple.of(
                                new int[]{0, 1, 3, 50, 75},
                                -100,
                                50
                        )
                ),
                Pair.of(
                        List.of("2", "4->49", "51->74", "76->200"),
                        Triple.of(
                                new int[]{0, 1, 3, 50, 75},
                                49,
                                200
                        )
                )
        );
    }
}
