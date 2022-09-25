package org.example.linkedlist;

import com.google.common.base.Preconditions;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(ListNode toCopy) {
        Preconditions.checkNotNull(toCopy, "Shouldn't be null");

        this.val = toCopy.val;
        if (toCopy.next != null) {
            this.next = new ListNode(toCopy.next);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        ListNode next = this.next;
        var stringBuilder = new StringBuilder();
        stringBuilder.append(this.val);
        while (next != null) {
            stringBuilder.append("->").append(next.val);
            next = next.next;
        }
        return stringBuilder.toString();
    }
}
