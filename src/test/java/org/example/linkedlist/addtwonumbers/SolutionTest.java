package org.example.linkedlist.addtwonumbers;

import org.apache.commons.lang3.tuple.Triple;
import org.example.linkedlist.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void addTwoNumbers(Triple<ListNode, ListNode, ListNode> testCase) {
        var solution = new Solution();
        assertEquals(testCase.getLeft(), solution.addTwoNumbers(testCase.getMiddle(), testCase.getRight()));
    }

    private static Iterable<Triple<ListNode, ListNode, ListNode>> testCases() {
        return List.of(testCase1(), testCase2(), testCase3());
    }

    private static Triple<ListNode, ListNode, ListNode> testCase1() {
        var expected = new ListNode(
                7, new ListNode(
                0, new ListNode(
                8)
        )
        );

        var l1 = new ListNode(
                2, new ListNode(
                4, new ListNode(
                3
        )
        )
        );

        var l2 = new ListNode(
                5, new ListNode(
                6, new ListNode(
                4
        )
        )
        );

        return Triple.of(expected, l1, l2);
    }

    private static Triple<ListNode, ListNode, ListNode> testCase2() {
        var expected = new ListNode(0);
        var l1 = new ListNode(0);
        var l2 = new ListNode(0);
        return Triple.of(expected, l1, l2);
    }

    private static Triple<ListNode, ListNode, ListNode> testCase3() {
        var expected = new ListNode(
                8, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                1)
        )
        )
        )
        )
        )
        )
        );

        var l1 = new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9)
        )
        )
        )
        )
        )
        );

        var l2 = new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9)
        )
        )
        );

        return Triple.of(expected, l1, l2);
    }
}
