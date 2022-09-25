package org.example.linkedlist.mergetwosortedlists;

import org.example.linkedlist.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        var list1P = list1;
        var list2P = list2;
        var result = new ListNode();
        if (list1P.val > list2P.val) {
            result.val = list2P.val;
            list2P = list2P.next;
        } else {
            result.val = list1P.val;
            list1P = list1P.next;
        }
        var resultIter = result;

        while (list1P != null && list2P != null) {
            resultIter.next = new ListNode();
            resultIter = resultIter.next;
            if (list1P.val > list2P.val) {
                resultIter.val = list2P.val;
                list2P = list2P.next;
            } else {
                resultIter.val = list1P.val;
                list1P = list1P.next;
            }
        }

        while (list1P != null) {
            resultIter.next = new ListNode();
            resultIter = resultIter.next;
            resultIter.val = list1P.val;
            list1P = list1P.next;
        }

        while (list2P != null) {
            resultIter.next = new ListNode();
            resultIter = resultIter.next;
            resultIter.val = list2P.val;
            list2P = list2P.next;
        }

        return result;
    }
}
