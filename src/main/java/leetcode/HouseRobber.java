package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/13.
 */
public class HouseRobber {

    private static final Logger log = LogManager.getLogger(HouseRobber.class);

    /*
    * Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
    Memory Usage: 36.9 MB, less than 5.26% of Java online submissions for House Robber.
    * */
    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[len];
    }

    public static int rob2(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int prePre = 0, pre = nums[0], current = pre;

        for (int i = 2; i <= len; i++) {
            current = Math.max(pre, prePre + nums[i - 1]);
            prePre = pre;
            pre = current;
        }
        return current;
    }
}

