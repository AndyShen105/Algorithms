package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-10-30.
 */
public class SingleNumberII {

    private static final Logger log = LogManager.getLogger(SingleNumberII.class);

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0, temp = 0;
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j] % 2;
                nums[j] = nums[j] / 2;
                sum += temp;
            }
            result |= (sum % 3) << i;
        }
        return result;
    }

    // 只能处理负数
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1, 99};
        //log.info(4>>1);
        log.info(singleNumber(array));
    }
}

