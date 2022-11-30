package org.example.tree.constructbinarytreefrominorderandpostordertraversal;

import org.example.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private int postorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; ++i) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTree(postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] postorder, int l, int r) {
        if (l > r) {
            return null;
        }

        int rootVal = postorder[postorderIndex--];
        var root = new TreeNode(rootVal);

        root.right = buildTree(postorder, inorderIndexMap.get(rootVal) + 1, r);
        root.left = buildTree(postorder, l, inorderIndexMap.get(rootVal) - 1);

        return root;
    }
}
