package leetcode;

/**
 * Created by hang.shen@transwarp.io on 20-04-15.
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length, max = 1;
        if(len < 2) return len;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if(nums[i] >= nums[j] && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                }
               // if(dp[i] > j) break;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
