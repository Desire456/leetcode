package org.example.array.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }

                String seenInRow = board[i][j] + " in row " + i;
                String seenInColumn = board[i][j] + " in column " + j;
                String seenInSubBox = board[i][j] + " in sub box " + i / 3 + "_" + j / 3;

                if (seen.contains(seenInRow) || seen.contains(seenInColumn)
                        || seen.contains(seenInSubBox)) {
                    return false;
                }
                seen.add(seenInRow);
                seen.add(seenInColumn);
                seen.add(seenInSubBox);
            }
        }

        return true;
    }
}
