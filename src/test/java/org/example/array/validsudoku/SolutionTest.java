package org.example.array.validsudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isValidSudoku() {
        var solution = new Solution();

        char[][] board = new char[][]{
                {'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'},
                {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'},
                {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'},
                {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'},
                {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'},
                {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'},
                {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'},
                {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'},
                {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}
        };
        assertTrue(solution.isValidSudoku(board));


        board = new char[][]{
                {'8' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'},
                {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'},
                {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'},
                {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'},
                {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'},
                {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'},
                {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'},
                {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'},
                {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}
        };
        assertFalse(solution.isValidSudoku(board));
    }
}
