package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-24.
 */
public class SearchinRotatedSortedArray {

    private static final Logger log = LogManager.getLogger(SearchinRotatedSortedArray.class);

    private static int bs(int[] nums, int start, int end, int target) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        if (target < nums[0] && target > nums[end]) return -1;
        if (nums[end] >= nums[start]) {
            return bs(nums, start, end, target);
        }
        int i = 0;
        for (; nums[i] < nums[i + 1]; i++) {
            if (nums[i] == target) return i;
        }
        if (nums[i] == target) return i;
        return bs(nums, i + 1, end, target);
    }

    public static void main(String[] args) {
        int[] array = {3, 1};
        log.info(search(array, 3));
    }
}

