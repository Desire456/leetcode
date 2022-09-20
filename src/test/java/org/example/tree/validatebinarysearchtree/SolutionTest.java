package org.example.tree.validatebinarysearchtree;

import org.example.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isValidBST() {
        var solution = new Solution();

        var root = testCase1();
        assertTrue(solution.isValidBST(root));

        root = testCase2();
        assertFalse(solution.isValidBST(root));
    }

    private TreeNode testCase1() {
        var root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        return root;
    }

    private TreeNode testCase2() {
        var root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        var node1 = root.right;
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(6);
        return root;
    }
}
