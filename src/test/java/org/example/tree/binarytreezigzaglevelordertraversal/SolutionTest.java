package org.example.tree.binarytreezigzaglevelordertraversal;

import org.apache.commons.lang3.tuple.Pair;
import org.example.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void zigzagLevelOrder(Pair<List<List<Integer>>, TreeNode> testCase) {
        assertEquals(testCase.getLeft(), SOLUTION.zigzagLevelOrder(testCase.getRight()));
    }

    private static List<Pair<List<List<Integer>>, TreeNode>> testCases() {
        List<List<Integer>> expected1 = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );

        var root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        var right1 = new TreeNode(20);
        root1.right = right1;
        right1.left = new TreeNode(15);
        right1.right = new TreeNode(7);

        List<List<Integer>> expected2 = List.of(
                List.of(1)
        );

        var root2 = new TreeNode(1);

        return List.of(
                Pair.of(
                        expected1, root1
                ),
                Pair.of(
                        expected2, root2
                ),
                Pair.of(
                        List.of(), null
                )
        );
    }
}
