package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/12.
 */
public class NumberOfIslands {

    private static final Logger log = LogManager.getLogger(NumberOfIslands.class);

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int x = grid.length, y = grid[0].length;
        char count = '2';
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1') {
                    helper(i, j, grid, count);
                    count += 1;
                }
            }
        }
        return count - '2';
    }

    private void helper(int i, int j, char[][] grid, char state) {
        log.info("{} {}", i, j);
        grid[i][j] = state;
        if (i - 1 >= 0 && grid[i - 1][j] == '1') {
            helper(i - 1, j, grid, state);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == '1') {
            helper(i + 1, j, grid, state);
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == '1') {
            helper(i, j + 1, grid, state);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1') {
            helper(i, j - 1, grid, state);
        }
    }
}

