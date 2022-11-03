package org.example.tree.convertsortedarraytobinarysearchtree;

import org.example.tree.TreeNode;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int middle = left + (right - left) / 2;

        var root = new TreeNode(nums[middle]);
        root.left = construct(nums, left, middle - 1);
        root.right = construct(nums, middle + 1, right);

        return root;
    }
}
