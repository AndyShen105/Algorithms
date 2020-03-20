package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-11-8.
 */
public class RemoveDuplicatesfromSortedArray {

    private static final Logger log = LogManager.getLogger(RemoveDuplicatesfromSortedArray.class);

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int currIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[currIndex]) {
                currIndex++;
                if (currIndex != i)
                    nums[currIndex] = nums[i];
            }
        }
        return currIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        log.info(removeDuplicates(nums));
        log.info("");
    }
}

