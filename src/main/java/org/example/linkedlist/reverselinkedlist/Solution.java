package org.example.linkedlist.reverselinkedlist;

import org.example.linkedlist.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head.val == 0) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
