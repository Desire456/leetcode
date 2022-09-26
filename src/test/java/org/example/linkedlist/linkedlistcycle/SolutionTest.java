package org.example.linkedlist.linkedlistcycle;

import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void hasCycle() {
        var solution = new Solution();

        assertTrue(solution.hasCycle(testCase1()));
        assertTrue(solution.hasCycle(testCase2()));
        assertFalse(solution.hasCycle(testCase3()));
    }

    private ListNode testCase1() {
        var node4 = new ListNode(-4);
        var node3 = new ListNode(0, node4);
        var node2 = new ListNode(2, node3);
        var node1 = new ListNode(3, node2);

        node4.next = node2;
        return node1;
    }

    private ListNode testCase2() {
        var node2 = new ListNode(2);
        var node1 = new ListNode(1, node2);

        node2.next = node1;
        return node1;
    }

    private ListNode testCase3() {
        return new ListNode(1);
    }
}
