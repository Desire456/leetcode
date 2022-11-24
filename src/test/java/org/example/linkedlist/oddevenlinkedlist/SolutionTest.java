package org.example.linkedlist.oddevenlinkedlist;

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
    public void oddEvenList(Pair<ListNode, ListNode> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.oddEvenList(testCase.getRight()));
    }

    private static List<Pair<ListNode, ListNode>> testCases() {
        return List.of(
                Pair.of(
                        new ListNode(1,
                                new ListNode(3,
                                        new ListNode(5,
                                                new ListNode(2,
                                                        new ListNode(4))))),
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5)))))
                ),
                Pair.of(
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(6,
                                                new ListNode(7,
                                                        new ListNode(1,
                                                                new ListNode(5,
                                                                        new ListNode(4))))))),
                        new ListNode(2,
                                new ListNode(1,
                                        new ListNode(3,
                                                new ListNode(5,
                                                        new ListNode(6,
                                                                new ListNode(4,
                                                                        new ListNode(7)))))))
                )
        );
    }
}
