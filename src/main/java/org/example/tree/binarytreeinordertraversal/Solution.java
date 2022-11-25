package org.example.tree.binarytreeinordertraversal;

import org.example.tree.TreeNode;

import java.util.*;

public class Solution {

    @SuppressWarnings("ConstantConditions")
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        var node = root;

        while (node != null || !q.isEmpty()) {
            while (node != null) {
                q.add(node);
                node = node.left;
            }

            result.add(q.peekLast().val);
            node = q.pollLast().right;
        }

        return result;
    }
}
