package org.example.linkedlist.deletenode;

import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void deleteNode() {
        var listNode1 = new ListNode(4);
        var listNode2 = new ListNode(5);
        var listNode3 = new ListNode(1);
        var listNode4 = new ListNode(9);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        new Solution().deleteNode(listNode2);

        int[] expectedValues = {4, 1, 9};
        int i = 0;
        var current = listNode1;
        while (current.next != null) {
            assertEquals(expectedValues[i], current.val);
            ++i;
            current = current.next;
        }
    }
}
