package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-12-30.
 */
public class SortColors {

    private static final Logger log = LogManager.getLogger(SortColors.class);

    public static void sortColors(int[] nums) {
        if (nums.length <= 1) return;
        int temp, current = 0, len = nums.length;
        for (int color = 0; color < 3; color++) {
            for (int i = 0; i < len; i++) {
                if (current == len) return;
                if (nums[i] == color) {
                    if (i != current) {
                        temp = nums[i];
                        nums[i] = nums[current];
                        nums[current] = temp;
                    }
                    current++;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0};
        sortColors(array);
        for (int a : array) {
            log.info(a);
        }

    }
}

