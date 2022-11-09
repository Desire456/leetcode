package org.example.linkedlist.addtwonumbers;

import org.example.linkedlist.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode dummyHead = result;
        int tmp = 0;

        while (l1 != null || l2 != null || tmp != 0) {
            int curr = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + tmp;
            tmp = curr / 10;
            result.next = new ListNode(curr % 10);
            result = result.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummyHead.next;
    }
}
