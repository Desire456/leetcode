package org.example.linkedlist.removenthnodefromendoflist;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        var solution = new Solution();

        var rootExpectedPair = testCase1();
        var root = rootExpectedPair.getLeft();
        var expected = rootExpectedPair.getRight();
        int n = 2;
        assertEquals(expected, solution.removeNthFromEnd(root, n));

        rootExpectedPair = testCase2();
        root = rootExpectedPair.getLeft();
        expected = rootExpectedPair.getRight();
        n = 1;
        assertEquals(expected, solution.removeNthFromEnd(root, n));
    }

    private ImmutablePair<ListNode, ListNode> testCase1() {
        var node5 = new ListNode(5);
        var node4 = new ListNode(4, node5);
        var node3 = new ListNode(3, node4);
        var node2 = new ListNode(2, node3);
        var root = new ListNode(1, node2);

        var expected = new ListNode(root);
        var iter = expected;
        while (iter.val != 3) {
            iter = iter.next;
        }
        iter.next = iter.next.next;

        return ImmutablePair.of(root, expected);
    }

    private ImmutablePair<ListNode, ListNode> testCase2() {
        var node2 = new ListNode(2);
        var root = new ListNode(1, node2);

        var expected = new ListNode(root);
        expected.next = null;

        return ImmutablePair.of(root, expected);

    }
}
