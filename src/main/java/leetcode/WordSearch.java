package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/29.
 */
public class WordSearch {

    private static final Logger log = LogManager.getLogger(WordSearch.class);
   /* Given a 2D board and a word, find if the word exists in the grid.

    The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally
    or vertically neighboring. The same letter cell may not be used more than once.

            Example:

    board =
            [
            ['A','B','C','E'],
            ['S','F','C','S'],
            ['A','D','E','E']
            ]

    Given word = "ABCCED", return true.
    Given word = "SEE", return true.
    Given word = "ABCB", return false.*/


    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return false;
        int[][] states = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (helper(board, states, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int[][] states, int x, int y, int offset, String word) {
        boolean flag = false;
        if (board[x][y] == word.charAt(offset)) {
            states[x][y] = 1;
            offset++;
            if (offset >= word.length()) {
                return true;
            }
            if (x - 1 >= 0 && states[x - 1][y] != 1) {
                flag = flag || helper(board, states, x - 1, y, offset, word);
            }
            if (x + 1 < states.length && states[x + 1][y] != 1) {
                flag = flag || helper(board, states, x + 1, y, offset, word);
            }
            if (y - 1 >= 0 && states[x][y - 1] != 1) {
                flag = flag || helper(board, states, x, y - 1, offset, word);
            }
            if (y + 1 < states[0].length && states[x][y + 1] != 1) {
                flag = flag || helper(board, states, x, y + 1, offset, word);
            }

        } else {
            return false;
        }
        if (!flag) states[x][y] = 0;
        return flag;
    }
}

