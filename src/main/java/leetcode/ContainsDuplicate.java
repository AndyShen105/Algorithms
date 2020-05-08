package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class ContainsDuplicate {
    private static final Logger log = LogManager.getLogger(ContainsDuplicate.class);

    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        Set<Integer> set = new HashSet<>();
        for (int number : nums) {
            if (set.contains(number)) {
                return true;
            } else {
                set.add(number);
            }
        }
        return false;
    }
}
