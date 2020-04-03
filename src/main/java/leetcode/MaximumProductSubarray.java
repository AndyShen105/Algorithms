package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/3.
 */
public class MaximumProductSubarray {
    /*
    * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

    Example 1:

    Input: [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.
    Example 2:

    Input: [-2,0,-1]
    Output: 0
    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    * */
    private static final Logger log = LogManager.getLogger(MaximumProductSubarray.class);

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                dpMax[i] = Math.max(nums[i], nums[i] * dpMax[i - 1]);
                dpMin[i] = Math.min(nums[i], nums[i] * dpMin[i - 1]);
            } else {
                dpMax[i] = Math.max(nums[i], nums[i] * dpMin[i - 1]);
                dpMin[i] = Math.min(nums[i], nums[i] * dpMax[i - 1]);
            }
            max = Math.max(max, dpMax[i]);

        }
        return max;
    }
}

