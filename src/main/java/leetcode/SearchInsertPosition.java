package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-27.
 */
public class SearchInsertPosition {

    private static final Logger log = LogManager.getLogger(SearchInsertPosition.class);

    public SearchInsertPosition() {
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 1, end = nums.length;
        if (nums.length == 0 || target <= nums[0]) return 0;
        if (target > nums[end - 1]) return end;
        boolean flag = true;
        int re = -1;
        while (flag) {
            int mid = (start + end) / 2;
            if (target > nums[mid - 1] && target <= nums[mid]) {
                re = mid;
                flag = false;
            } else if (target > nums[mid - 1] && target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 6};
        int t1 = 5;
        log.info(searchInsert(a1, t1));

        int[] a2 = {1, 3, 5, 6};
        int t2 = 2;
        log.info(searchInsert(a2, t2));

        int[] a3 = {1, 3, 5, 6};
        int t3 = 7;
        log.info(searchInsert(a3, t3));

        int[] a4 = {0};
        int t4 = 0;
        log.info(searchInsert(a4, t4));
    }
}

