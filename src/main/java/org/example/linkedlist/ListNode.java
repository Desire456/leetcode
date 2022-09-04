package org.example.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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
