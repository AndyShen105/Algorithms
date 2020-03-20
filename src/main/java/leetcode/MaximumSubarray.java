package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.max;

/**
 * Created by hang.shen@transwarp.io on 19-12-12.
 */
public class MaximumSubarray {

    private static final Logger log = LogManager.getLogger(MaximumSubarray.class);

    public static int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE, curSum = 0;
        for (int n : nums) {
            curSum = Math.max(curSum + n, n);
            res = Math.max(res, curSum);
        }
        return res;
    }
}

