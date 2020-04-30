package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/30.
 */
public class RemoveDuplicatesFromSortedArrayII {

    private static final Logger log = LogManager.getLogger(RemoveDuplicatesFromSortedArrayII.class);

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) return len;
        int[] state = {0, nums[0], 1};
        for (int i = 1; i < len; i++) {
            if (nums[i] != state[1]) {
                nums[state[0] + 1] = nums[i];
                state[0] = state[0] + 1;
                state[1] = nums[i];
                state[2] = 1;

            } else {
                if (state[2] < 2) {
                    state[0] = 1 + state[0];
                    nums[state[0]] = nums[i];
                    state[2] = state[2] + 1;
                }
            }
        }
        return state[0] + 1;
    }
}

