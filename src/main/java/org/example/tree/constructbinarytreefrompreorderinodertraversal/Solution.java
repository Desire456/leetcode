package org.example.tree.constructbinarytreefrompreorderinodertraversal;

import org.example.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private int preorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; ++i) {
            inorderIndexMap.put(inorder[i], i);
        }

        return arrayToTree(preorder, 0, preorder.length - 1);
    }

    //preorder = [3,9,20,15,7]
    //inorder = [9,3,15,20,7]
    private TreeNode arrayToTree(int[] preorder, int left, int right) {
       if (left > right) {
           return null;
       }

       var rootVal = preorder[preorderIndex++];
       var root = new TreeNode(rootVal);

       root.left = arrayToTree(preorder, left, inorderIndexMap.get(rootVal) - 1);
       root.right = arrayToTree(preorder,inorderIndexMap.get(rootVal) + 1, right);
       return root;
    }
}
