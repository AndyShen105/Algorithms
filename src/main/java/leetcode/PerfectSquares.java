package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */
public class PerfectSquares {

    private static final Logger log = LogManager.getLogger(PerfectSquares.class);

    public static int numSquares(int n) {
        int i = 1;
        int[] dp = new int[n + 1];
        while (i <= n) {
            if (i * i <= n) dp[i * i] = 1;
            i += 1;
        }

        for (int j = 2; j <= n; j++) {
            for (int m = 1; m < j; m++) {
                if (dp[j] == 0) {
                    dp[j] = dp[m] + dp[j - m];
                } else {
                    dp[j] = Math.min(dp[j], dp[m] + dp[j - m]);
                }
            }
        }
        return dp[n];
    }
}

