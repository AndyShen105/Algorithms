package leetcode;

/**
 * Created by hang.shen@transwarp.io on 2020/4/10.
 */
public class MaximalSquare {
    /*
    * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

    Example:

    Input:

    1 0 1 0 0
    1 0 1 1 1
    1 1 1 1 1
    1 0 0 1 0

    Output: 4
    * */
    @SuppressWarnings("unchecked")
    public static int maximalSquare(char[][] matrix) {
        int x = matrix.length, y = matrix[0].length, max = 0;
        int[] dpy = new int[y], dpx = new int[y], dp = new int[y];
        for (int i = 0; i < y; i++) {
            dp[i] = matrix[0][i] == '1' ? 1 : 0;
            dpy[i] = matrix[0][i] == '1' ? 1 : 0;
            if (i == 0) {
                dpx[i] = matrix[0][i] == '1' ? 1 : 0;
            } else {
                dpx[i] = matrix[0][i] == '1' ? dpx[i - 1] + 1 : 0;
            }
        }

        for (int i = 1; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == 0) {
                    dp[j] = matrix[i][j] == '1' ? 1 : 0;
                    dpx[j] = matrix[i][j] == '1' ? 1 : 0;
                    dpy[j] = matrix[i][j] == '1' ? dpy[i] + 1 : 0;
                } else {
                    dpx[j] = matrix[i][j] == '1' ? dpx[i - 1] + 1 : 0;
                    dpy[j] = matrix[i][j] == '1' ? dpy[i] + 1 : 0;
                    dp[j] = matrix[i][j] == '0' ? 0 : (dpx[j] > dp[j - 1] && dpy[j] > dp[j - 1] ? dp[j - 1] + 1 : 0);
                    if (dp[j] > max) max = dp[j];
                }
            }
        }

        return max * max;
    }

    public static int maximalSquare2DDP(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int x = matrix.length, y = matrix[0].length, max = 0;
        int[][] dp = new int[x + 1][y + 1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = matrix[i - 1][j - 1] == '0' ? 0 :
                            Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }
}

