package org.example.tree.binarytreelevelordertraversal;

import org.example.tree.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            var size = queue.size();
            for (int i = 0; i < size; i++) {
                var node = queue.poll();
                curr.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(curr);
        }

        return result;
    }
}
