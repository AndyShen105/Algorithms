package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/3/20.
 */
public class JumpGame2 {
    /*
    * Given an array of non-negative integers, you are initially positioned at the first index of the array.

    Each element in the array represents your maximum jump length at that position.

    Your goal is to reach the last index in the minimum number of jumps.

    Example:

    Input: [2,3,1,1,4]
    Output: 2
    Explanation: The minimum number of jumps to reach the last index is 2.
        Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Note:

    You can assume that you can always reach the last index.
    *
    * */
    private static final Logger log = LogManager.getLogger(JumpGame2.class);

    public static int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int current = nums.length - 1, count = 0;
        while (true) {
            int temp = current;
            for (int i = 0; i < current; i++) {
                if (nums[i] >= current - i) {
                    current = i;
                    count++;
                    if (i == 0) {
                        return count;
                    }

                    break;
                }
            }
            if (temp == current) break;
        }
        return -1;
    }
}

