package org.example.tree;

import java.util.Objects;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(Node node) {
        val = node.val;
        if (node.left != null) {
            left = new Node(node.left);
        }
        if (node.right != null) {
            right = new Node(node.right);
        }
        if (node.next != null) {
            next = new Node(node.next);
        }
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right, next);
    }
}
