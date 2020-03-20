package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hang.shen@transwarp.io on 19-12-10.
 */
public class MajorityElement {

    private static final Logger log = LogManager.getLogger(MajorityElement.class);

    public static int majorityElement(int[] nums) {
        int th = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int temp = map.get(i) + 1;
                if (temp > th) {
                    return i;
                }
                map.put(i, temp);
            } else {
                map.put(i, 1);
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {

        int[] nums = {1};
        log.info(majorityElement(nums));
    }
}

