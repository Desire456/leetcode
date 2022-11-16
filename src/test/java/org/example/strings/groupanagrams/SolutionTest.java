package org.example.strings.groupanagrams;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void groupAnagrams(Pair<List<List<String>>, String[]> testCase) {
        var expected = testCase.getLeft();
        var actual = solution.groupAnagrams(testCase.getRight());
        assertEquals(expected, actual);
    }

    private static List<Pair<List<List<String>>, String[]>> testCases() {
        return List.of(
                Pair.of(
                        new ArrayList<>(List.of(
                                List.of("eat", "tea", "ate"),
                                List.of("bat"),
                                List.of("tan", "nat")
                        )),
                        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}
                ),
                Pair.of(
                        List.of(
                        ),
                        new String[]{}
                ),
                Pair.of(
                        List.of(
                                new ArrayList<>(List.of("a"))
                        ),
                        new String[]{"a"}
                )
        );
    }
}
