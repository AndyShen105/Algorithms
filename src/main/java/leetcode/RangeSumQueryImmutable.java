package leetcode;

/**
 * Created by hang.shen@transwarp.io on 20--4-15.
 */
public class RangeSumQueryImmutable {

    public static class NumArray {
        int[] dp;
        boolean flag = true;

        public NumArray(int[] nums) {
            if(nums.length == 0) {
                flag = false;
                return;
            }
            dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if(!flag) return 0;
            return i == 0 ? dp[j] : dp[j] - dp[i - 1];
        }
    }
}
