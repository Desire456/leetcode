package org.example.tree.populatingnextrightpointersineachnode;

import org.example.tree.Node;

public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        var leftNode = root;
        while (leftNode.left != null) {
            var curr = leftNode;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            leftNode = leftNode.left;
        }

        return root;
    }
}
