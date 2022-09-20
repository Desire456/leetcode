package org.example.tree.maximumdepthofbinarytree;

import org.example.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void maxDepth() {
        var solution = new Solution();

        var root = testCase1();
        Assertions.assertEquals(3, solution.maxDepth(root));

        root = testCase2();
        Assertions.assertEquals(2, solution.maxDepth(root));
    }

    private TreeNode testCase1() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        var node1 = root.right;
        node1.left = new TreeNode(15);
        node1.right = new TreeNode(7);
        return root;
    }

    private TreeNode testCase2() {
        var root = new TreeNode(1);
        root.right = new TreeNode(2);
        return root;
    }
}
