package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by hang.shen@transwarp.io on 2020-04-22.
 */
public class ThreeSum {
    private static final Logger log = LogManager.getLogger(ThreeSum.class);

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int len = nums.length, start, temp, end;
        if (len < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
                temp = nums[i] + nums[start] + nums[end];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    start++;
                    end--;
                    set.add(list);
                } else if (temp < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        Iterator it = set.iterator();
        while(it.hasNext()) {
            result.add((List<Integer>) it.next());
        }
        return result;
    }
}
