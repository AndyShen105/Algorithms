package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/4.
 */
public class TowKeysKeyboard {

    private static final Logger log = LogManager.getLogger(TowKeysKeyboard.class);

    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        int[] state = new int[n + 1];
        dp[1] = 0;
        state[1] = 0;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = i;
            for (int j = 0; j < i; j++) {
                if (i == state[j] + j && dp[j] + 1 < dp[i]) {
                    dp[i] = dp[j] + 1;
                    state[i] = state[j];
                }
                if (i == 2 * j && dp[j] + 2 < dp[i]) {
                    dp[i] = dp[j] + 2;
                    state[i] = j;
                }
            }
        }
        return dp[n];
    }
    /*其实可以发现，因子相同的情况下，交换因子相乘的顺序，需要的步骤是一样的。所以我们可以简化一下分解的步骤，只需要找到小于sqrt(n)的因子即可。
    假设找到的因子是 j ，那么需要的最小步骤就是 dp[j] + dp[i/j]，其中，dp[j]表示需要多少步生成这个因子，dp[i/j]表示需要多少步基于这个因子得到 i。*/

    public int minSteps2(int n) {
        int[] dp = new int[n + 1];
        int h = (int) Math.sqrt(n);
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= h; j++) {
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                    break;
                }
            }
        }
        return dp[n];
    }

}




