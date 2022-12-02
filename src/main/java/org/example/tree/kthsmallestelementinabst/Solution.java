package org.example.tree.kthsmallestelementinabst;

import org.example.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    @SuppressWarnings("ConstantConditions")
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> q = new LinkedList<>();
        while (true) {
            while (root != null) {
                q.add(root);
                root = root.left;
            }

            root = q.pollLast();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }
}
