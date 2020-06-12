package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/6/12.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    private static final Logger log = LogManager.getLogger(FindFirstAndLastPositionOfElementInSortedArray.class);

    public int[] searchRange(int[] nums, int target) {
        int mid, len = nums.length, start = 0, end = len - 1;
        int result[] = {-1, -1};
        if (len == 0) return result;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                if (start == mid) {
                    if (nums[start] < target) {
                        start = end;
                        break;
                    }
                } else {
                    start = mid;
                }
            }
        }

        if (nums[start] != target && (start + 1) < len && nums[start + 1] != target) return result;

        boolean flag = true;
        for (int i = start; i < len; i++) {
            if (nums[i] == target) {
                if (flag) {
                    result[0] = i;
                    result[1] = i;
                    flag = false;
                } else {
                    result[1] = i;
                }
            }
        }
        return result;
    }
}

