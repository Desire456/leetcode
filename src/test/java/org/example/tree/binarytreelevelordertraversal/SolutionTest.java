package org.example.tree.binarytreelevelordertraversal;

import org.apache.commons.lang3.tuple.Pair;
import org.example.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void levelOrder() {
        var solution = new Solution();

        List<Pair<List<List<Integer>>, TreeNode>> testCases = List.of(
                testCase1(),
                testCase2(),
                testCase3()
        );

        for (var testCase : testCases) {
            assertEquals(testCase.getLeft(), solution.levelOrder(testCase.getRight()));
        }
    }


    private Pair<List<List<Integer>>, TreeNode> testCase1() {
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );

        var node1 = new TreeNode(3);
        var node2 = new TreeNode(9);
        var node3 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;
        var node4 = new TreeNode(15);
        var node5 = new TreeNode(7);
        node3.left = node4;
        node3.right = node5;

        return Pair.of(expected, node1);
    }

    private Pair<List<List<Integer>>, TreeNode> testCase2() {
        List<List<Integer>> expected = List.of(
                List.of(1)
        );

        var node1 = new TreeNode(1);

        return Pair.of(expected, node1);
    }

    private Pair<List<List<Integer>>, TreeNode> testCase3() {
        List<List<Integer>> expected = List.of();

        return Pair.of(expected, null);
    }
}
