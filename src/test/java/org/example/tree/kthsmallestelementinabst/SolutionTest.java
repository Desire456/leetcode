package org.example.tree.kthsmallestelementinabst;

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
    public void kthSmallest(Pair<Integer, Pair<TreeNode, Integer>> testCase) {
        var expected = testCase.getLeft();
        var given = testCase.getRight();
        assertEquals(expected, SOLUTION.kthSmallest(given.getLeft(), given.getRight()));
    }

    private static List<Pair<Integer, Pair<TreeNode, Integer>>> testCases() {
        var expected1 = 1;

        var root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.left.right = new TreeNode(2);

        var k1 = 1;

        var testCase1 = Pair.of(
                expected1, Pair.of(root1, k1)
        );

        var expected2 = 3;

        var root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(1);

        var k2 = 3;

        var testCase2 = Pair.of(
                expected2, Pair.of(root2, k2)
        );

        return List.of(
                testCase1, testCase2
        );
    }
}
