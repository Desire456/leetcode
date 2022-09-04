package org.example.linkedlist.reverselinkedlist;

import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void reverseList() {
        var solution = new Solution();

        var head = new ListNode(1);
        var copiedHead= head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);

        var reversed = solution.reverseList(copiedHead);
        Assertions.assertEquals("5->4->3->2->1", reversed.toString());
    }
}
