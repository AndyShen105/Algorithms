package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/9.
 */
public class RotateArray {

    private static final Logger log = LogManager.getLogger(RotateArray.class);

    public void rotate(int[] nums, int k) {
        if (nums.length < 2 || k == 0) return;
        k = k % nums.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) temp[i] = nums[i];
        int val;
        for (int i = 0; i < nums.length; i++) {
            val = nums[(i + k) % nums.length];
            nums[(i + k) % nums.length] = temp[(i + k) % k];
            temp[(i + k) % k] = val;
        }

    }
}

