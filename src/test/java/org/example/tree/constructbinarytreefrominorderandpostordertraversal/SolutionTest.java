package org.example.tree.constructbinarytreefrominorderandpostordertraversal;

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
    public void buildTree(Pair<TreeNode, Pair<int[], int[]>> testCase) {
        var expected = testCase.getLeft();
        var given = testCase.getRight();
        assertEquals(expected, SOLUTION.buildTree(given.getLeft(), given.getRight()));
    }

    private static List<Pair<TreeNode, Pair<int[], int[]>>> testCases() {
        var root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        var right1 = new TreeNode(20);
        root1.right = right1;
        right1.left = new TreeNode(15);
        right1.right = new TreeNode(7);

        var inorder1 = new int[]{9, 3, 15, 20, 7};
        var postorder1 = new int[]{9, 15, 7, 20, 3};

        var testCase1 = Pair.of(root1, Pair.of(inorder1, postorder1));

        var root2 = new TreeNode(-1);

        var inorder2 = new int[]{-1};
        var postorder2 = new int[]{-1};

        var testCase2 = Pair.of(root2, Pair.of(inorder2, postorder2));

        return List.of(testCase1, testCase2);
    }
}
