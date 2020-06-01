package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/1.
 */
public class SingleNumberIII {

    private static final Logger log = LogManager.getLogger(SingleNumberIII.class);

    public int[] singleNumber(int[] nums) {
        int diff = 0;
        // ^= 亦或
        for (int i = 0; i < nums.length; i++) {
            diff ^= nums[i];
        }
        diff &= -diff;// 取得任意一位为1的位

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & diff) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }
}

