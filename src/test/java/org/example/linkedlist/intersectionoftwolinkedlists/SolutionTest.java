package org.example.linkedlist.intersectionoftwolinkedlists;

import org.apache.commons.lang3.tuple.Pair;
import org.example.linkedlist.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void getIntersectionNode(Pair<ListNode, Pair<ListNode, ListNode>> testCase) {
        var given = testCase.getRight();

        assertEquals(testCase.getLeft(), SOLUTION.getIntersectionNode(given.getLeft(), given.getRight()));
    }

    private static List<Pair<ListNode, Pair<ListNode, ListNode>>> testCases() {
        var intersection1 =
                new ListNode(8,
                        new ListNode(4,
                                new ListNode(5)));
        Pair<ListNode, Pair<ListNode, ListNode>> testCase1 = Pair.of(
                intersection1,
                Pair.of(
                        new ListNode(4,
                                new ListNode(1,
                                        intersection1)
                        ),
                        new ListNode(5,
                                new ListNode(6,
                                        new ListNode(1,
                                                intersection1))
                        )
                )
        );

        var intersection2 =
                new ListNode(2,
                        new ListNode(4));
        var testCase2 = Pair.of(
                intersection2,
                Pair.of(
                        new ListNode(1,
                                new ListNode(9,
                                        new ListNode(1,
                                                intersection2))),
                        new ListNode(3,
                                intersection2)
                ));

        var testCase3 = Pair.of(
                (ListNode) null,
                Pair.of(
                        new ListNode(2,
                                new ListNode(6,
                                        new ListNode(4))),
                        new ListNode(1,
                                new ListNode(5))
                )
        );

        return List.of(testCase1, testCase2, testCase3);
    }
}
