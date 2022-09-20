package org.example.tree.symmetrictree;

import org.example.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isSymmetric() {
        var solution = new Solution();

        var root = testCase1();
        assertTrue(solution.isSymmetric(root));

        root = testCase2();
        assertFalse(solution.isSymmetric(root));
    }

    private TreeNode testCase1() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        var node1 = root.left;
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(4);
        var node2 = root.right;
        node2.left = new TreeNode(4);
        node2.right = new TreeNode(3);
        return root;
    }

    private TreeNode testCase2() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        var node1 = root.left;
        node1.left = new TreeNode(3);
        var node2 = root.right;
        node2.left = new TreeNode(3);
        return root;
    }
}
