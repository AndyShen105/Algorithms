package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/5.
 */
public class ValidTriangleNumber {

    private static final Logger log = LogManager.getLogger(ValidTriangleNumber.class);

    public int triangleNumber(int[] nums) {
        if (nums.length < 3) return 0;
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                for (int w = j + 1; w < nums.length; w++) {
                    if (isTriangle(nums[i], nums[j], nums[w])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean isTriangle(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return false;
        }

        if (x + y > z && x + z > y && y + z > x) {
            return true;
        }
        return false;
    }
}

