package org.example.linkedlist.palindromelinkedlist;

import org.example.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        var solution = new Solution();

        assertTrue(solution.isPalindrome(testCase1()));
        assertFalse(solution.isPalindrome(testCase2()));
    }

    public ListNode testCase1() {
        var node4 = new ListNode(1);
        var node3 = new ListNode(2, node4);
        var node2 = new ListNode(2, node3);
        return new ListNode(1, node2);
    }

    public ListNode testCase2() {
        return new ListNode(1,
                new ListNode(2)
        );
    }
}
