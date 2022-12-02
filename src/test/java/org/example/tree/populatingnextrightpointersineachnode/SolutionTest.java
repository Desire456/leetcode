package org.example.tree.populatingnextrightpointersineachnode;

import org.apache.commons.lang3.tuple.Pair;
import org.example.tree.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @ParameterizedTest
    @MethodSource("testCases")
    public void connect(Pair<Node, Node> testCase) {
        var left = testCase.getLeft();
        var connect = SOLUTION.connect(testCase.getRight());
        assertEquals(left, connect);
    }

    private static List<Pair<Node, Node>> testCases() {
        /*
                           1
                   2               3
               4       5       6       7

         */
        var node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);
        node1.left.left = new Node(4);
        node1.left.right = new Node(5);
        node1.right.left = new Node(6);
        node1.right.right = new Node(7);

        var expected1 = new Node(node1);
        var expected1Curr = expected1.left;
        //2 -> 3
        expected1Curr.next = node1.right;
        expected1Curr = expected1Curr.left;
        //4 -> 5
        expected1Curr.next = node1.left.right;
        var pointer5 = expected1Curr.next;
        expected1Curr = expected1Curr.next;
        //5 -> 6
        expected1Curr.next = node1.right.left;
        var pointer6 = expected1Curr.next;
        expected1Curr = expected1Curr.next;
        //6 -> 7
        expected1Curr.next = node1.right.right;

        expected1.left.right = pointer5;
        expected1.right.left = pointer6;

        var testCase1 = Pair.of(
                expected1, node1
        );

        var testCase2 = Pair.of(
                (Node) null, (Node) null
        );
        return List.of(
                testCase1, testCase2
        );
    }
}
