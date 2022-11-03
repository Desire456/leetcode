package org.example.tree.convertsortedarraytobinarysearchtree;

import com.sun.source.tree.Tree;
import org.apache.commons.lang3.tuple.Pair;
import org.example.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void sortedArrayToBST() {
        var solution = new Solution();

        List<Pair<TreeNode, int[]>> testCases = List.of(
                testCase1(),
                testCase2()
        );
        for (var testCase : testCases) {
            assertEquals(testCase.getLeft(), solution.sortedArrayToBST(testCase.getRight()));
        }
    }

    private Pair<TreeNode, int[]> testCase1() {
        var node1 = new TreeNode(0);
        var node2 = new TreeNode(-10);
        var node3 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;

        var node4 = new TreeNode(-3);
        node2.right = node4;

        var node5 = new TreeNode(9);
        node3.right = node5;

        var nums = new int[] {-10, -3, 0, 5, 9};
        return Pair.of(node1, nums);
    }

    private Pair<TreeNode, int[]> testCase2() {
        var node1 = new TreeNode(1);
        node1.right = new TreeNode(3);

        var nums = new int[] {1, 3};
        return Pair.of(node1, nums);
    }
}
