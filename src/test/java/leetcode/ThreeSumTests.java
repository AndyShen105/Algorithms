package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-22.
 */
public class ThreeSumTests {
    private static final Logger log = LogManager.getLogger(ThreeSumTests.class);
    @Test
    public void ThreeSumTest1() {
        int[] array = {-1, 0, 1, 2, -1, -4};
        log.info(ThreeSum.threeSum(array));
    }

    @Test
    public void ThreeSumTest2() {
        int[] array = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        log.info(ThreeSum.threeSum(array));
    }
}
