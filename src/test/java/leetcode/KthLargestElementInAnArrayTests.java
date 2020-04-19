package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/19.
 */
public class KthLargestElementInAnArrayTests {
    private static final Logger log = LogManager.getLogger(KthLargestElementInAnArrayTests.class);
    @Test
    public void KthLargestElementInAnArrayTest1() {

        int[] array = {3,2,1,5,6,4};
        log.info(KthLargestElementInAnArray.findKthLargest(array, 2));

    }
}
