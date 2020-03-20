package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 19-9-29.
 */
public class RemoveElement {

    private static final Logger log = LogManager.getLogger(RemoveElement.class);

    public RemoveElement() {
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int count = 0;
        int index = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            } else {
                while (nums[index] == val && index > 0) {
                    index--;
                }
                if (i < index) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arrays = {1};
        int val = 1;

        int count = removeElement(arrays, val);
        for (int i = 0; i < count; i++) {
            log.info(arrays[i]);
        }
    }

}

