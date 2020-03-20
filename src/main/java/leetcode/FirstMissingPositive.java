package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

/**
 * Created by hang.shen@transwarp.io on 19-10-16.
 */
public class FirstMissingPositive {

    private static final Logger log = LogManager.getLogger(FirstMissingPositive.class);

    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> nSet = new HashSet<>();
        for (int i : nums) {
            if (i > max) max = i;
            nSet.add(i);
        }
        int target = max + 1;
        for (int i = 1; i < i + 1; i++) {
            if (!nSet.contains(i)) {
                target = i;
                break;
            }

        }
        return target;
    }

    public static void main(String[] args) {

        int[] arr = {2147483647, 2147483646, 2147483645, 3, 2, 1, -1, 0, -2147483648};
        log.info(firstMissingPositive(arr));
    }
}

