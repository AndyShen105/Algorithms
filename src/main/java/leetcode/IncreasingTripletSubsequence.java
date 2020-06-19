package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/19.
 */
public class IncreasingTripletSubsequence {

    private static final Logger log = LogManager.getLogger(IncreasingTripletSubsequence.class);

    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        if (nums[1] <= nums[0]) {
            nums[0] = nums[1];
            nums[1] = Integer.MAX_VALUE;
        }
        for (int i = 2; i < len; i++) {
            if (nums[i] > nums[1]) {
                return true;
            } else if (nums[i] > nums[0]) {
                nums[1] = nums[i];
            } else if (nums[i] < nums[0]) {
                nums[0] = nums[i];
            }
        }
        return false;
    }
}

