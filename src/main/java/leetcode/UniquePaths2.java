package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/3/24.
 */
public class UniquePaths2 {

    private static final Logger log = LogManager.getLogger(UniquePaths2.class);

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[i] = 0;
            } else {
                dp[i] = i == 0 ? 1 : dp[i - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (0 == j) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[j] = 0;
                    }
                } else {
                    dp[j] = obstacleGrid[i][j] == 1 ? 0 : dp[j] + dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }
}

