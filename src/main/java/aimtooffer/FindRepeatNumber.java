package aimtooffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 2020-04-21.
 */
public class FindRepeatNumber {
    private static final Logger log = LogManager.getLogger(FindRepeatNumber.class);

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            } else {
                set.add(n);
            }
        }
        return -1;
    }
}
