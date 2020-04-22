package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Created by hang.shen@transwarp.io on 2020-04-22.
 */
public class ThreeSumClosest {
    private static final Logger log = LogManager.getLogger(ThreeSumClosest.class);

    public static int threeSumClosest(int[] nums, int target) {
        int start, end, temp, len = nums.length, result = Integer.MAX_VALUE-5;
        if (len < 3) return 0;
        if(len == 3) return nums[0] + nums[1] +nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
                temp = nums[i] + nums[start] + nums[end];
                log.info(" {} {}",Math.abs(temp - target), Math.abs(result - target));
                if (Math.abs(temp - target) < Math.abs(result - target)) {
                    result = temp;
                }
                if (temp < target) {
                    start++;
                } else if (temp > target){
                    end--;
                }else {
                    return target;
                }
            }
        }

        return result;
    }
}
