package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/3/23.
 */
public class UniquePaths {
    /*

    Above is a 7 x 3 grid. How many possible unique paths are there?



    Example 1:

    Input: m = 3, n = 2
    Output: 3
    Explanation:
    From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
    1. Right -> Right -> Down
    2. Right -> Down -> Right
    3. Down -> Right -> Right
    Example 2:

    Input: m = 7, n = 3
    Output: 28


    Constraints:

    1 <= m, n <= 100
    It's guaranteed that the answer will be less than or equal to 2 * 10 ^ 9.
    Accepted
    405,590
    Submissions
    786,750
    * */
    private static final Logger log = LogManager.getLogger(UniquePaths.class);

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = 1;
        for (int j = 1; j < m; j++) {
            for (int i = 1; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i];
            }
        }
        return dp[n - 1];
    }

    public static int uniquePathsDP(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePathsRecursion(int m, int n) {
        return uniquePaths(1, 1, m, n);
    }

    public int uniquePaths(int currentRow, int currentColumn, int m, int n) {
        if (currentRow == m || currentColumn == n) {
            return 1;
        }
        return uniquePaths(currentRow + 1, currentColumn, m, n) + uniquePaths(currentRow, currentColumn + 1, m, n);
    }
}

