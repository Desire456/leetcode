package org.example.linkedlist.palindromelinkedlist;

import org.example.linkedlist.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode firstHalfEnd = getFirstHalfEnd(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean res = true;
        while (res && p2 != null) {
            if (p1.val != p2.val) {
                res = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        firstHalfEnd.next = reverse(secondHalfStart);
        return res;
    }

    public ListNode reverse(ListNode root) {
        ListNode prev = null;
        ListNode curr = root;

        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }

    public ListNode getFirstHalfEnd(ListNode root) {
        ListNode fast = root;
        ListNode slow = root;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
