package org.example.tree.binarytreezigzaglevelordertraversal;

import org.example.tree.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        boolean left = true;
        Deque<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> part = new ArrayList<>();
            while (size != 0) {
                var node = q.poll();
                part.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                size--;
            }

            if (!left) {
                Collections.reverse(part);
            }
            left = !left;
            res.add(part);
        }
        return res;
    }
}
