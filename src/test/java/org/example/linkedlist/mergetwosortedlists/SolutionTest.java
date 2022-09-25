package org.example.linkedlist.mergetwosortedlists;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        var solution = new Solution();

        var list1list2expectedTriple = testCase1();
        var list1 = list1list2expectedTriple.getLeft();
        var list2 = list1list2expectedTriple.getMiddle();
        var expected = list1list2expectedTriple.getRight();

        assertEquals(expected, solution.mergeTwoLists(list1, list2));
    }

    private Triple<ListNode, ListNode, ListNode> testCase1() {
        var node13 = new ListNode(4);
        var node12 = new ListNode(2, node13);
        var node11 = new ListNode(1, node12);

        var node23 = new ListNode(4);
        var node22 = new ListNode(3, node23);
        var node21 = new ListNode(1, node22);

        var node36 = new ListNode(4);
        var node35 = new ListNode(4, node36);
        var node34 = new ListNode(3, node35);
        var node33 = new ListNode(2, node34);
        var node32 = new ListNode(1, node33);
        var node31 = new ListNode(1, node32);

        return ImmutableTriple.of(node11, node21, node31);
    }
}
