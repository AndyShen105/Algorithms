package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/22.
 */
public class ProductofArrayExceptSelf {

    private static final Logger log = LogManager.getLogger(ProductofArrayExceptSelf.class);

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        result[0] = temp;
        for (int i = 1; i < nums.length; i++) {
            temp *= nums[i - 1];
            result[i] = temp;
        }
        temp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            temp *= nums[i + 1];
            result[i] *= temp;
        }
        return result;
    }
}

