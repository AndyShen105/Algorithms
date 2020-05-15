package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/14.
 */
public class CoinChange {
   /* You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

    Example 1:

    Input: coins = [1, 2, 5], amount = 11
    Output: 3
    Explanation: 11 = 5 + 5 + 1
    Example 2:

    Input: coins = [2], amount = 3
    Output: -1
    Note:
    You may assume that you have an infinite number of each kind of coin.*/

    private static final Logger log = LogManager.getLogger(CoinChange.class);

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        for (int i = 1; i < dp.length; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {

                if (i - coins[j] < 0 || dp[i - coins[j]] == -1) {
                    dp[i] = -1;
                } else {

                    temp = Math.min(temp, dp[i - coins[j]] + 1);
                }
            }
            if (temp != Integer.MAX_VALUE) {
                dp[i] = temp;
            }
        }
        return dp[amount];
    }
}

