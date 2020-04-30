package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/30.
 */
public class RemoveDuplicatesFromSortedArrayIITests {

    private static final Logger log = LogManager.getLogger(RemoveDuplicatesFromSortedArrayIITests.class);

    @Test
    public void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();
        int i = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);
        log.info(i);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();
        int i = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);
        log.info(i);
    }
}

