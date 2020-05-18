package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/5/18.
 */
public class FindMinimuminRotatedSortedArray {

    private static final Logger log = LogManager.getLogger(FindMinimuminRotatedSortedArray.class);

    public int findMin(int[] nums) {
        int mid, start = 0, end = nums.length;
        for (; ; ) {
            mid = (start + end) / 2;
            if (end - start == 1) return nums[start];
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (mid + 1 < nums.length && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] < nums[start]) {
                end = mid;
            } else if (nums[mid] > nums[end - 1]) {
                start = mid + 1;
            } else {
                return nums[0];
            }
        }

    }
}

