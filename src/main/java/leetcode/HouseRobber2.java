package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/13.
 */
public class HouseRobber2 {

    private static final Logger log = LogManager.getLogger(HouseRobber2.class);

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        if (len == 2) return Math.max(nums[0], nums[1]);
        int prePre1 = 0, pre1 = nums[0], current1 = pre1;
        int prePre2 = 0, pre2 = nums[1], current2 = pre2;
        for (int i = 2; i <= len - 1; i++) {
            current1 = Math.max(pre1, prePre1 + nums[i - 1]);
            prePre1 = pre1;
            pre1 = current1;

            current2 = Math.max(pre2, prePre2 + nums[i]);
            prePre2 = pre2;
            pre2 = current2;
        }

        return Math.max(current1, current2);
    }
}

