package org.example.tree.binarytreeinordertraversal;

import org.apache.commons.lang3.tuple.Pair;
import org.example.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void inorderTraversal(Pair<List<Integer>, TreeNode> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.inorderTraversal(testCase.getRight()));
    }

    private static List<Pair<List<Integer>, TreeNode>> testCases() {
        var root1 = new TreeNode(1);
        root1.left = null;
        root1.right = new TreeNode(2);
        var right1 = root1.right;
        right1.left = new TreeNode(3);
        right1.right = null;

        var root3 = new TreeNode(1);

        return List.of(
                Pair.of(
                        List.of(1, 3, 2),
                        root1
                ),
                Pair.of(
                        List.of(),
                        null
                ),
                Pair.of(
                        List.of(1),
                        root3
                )
        );
    }
}
