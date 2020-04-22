package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-22.
 */
public class ThreeSumClosestTests {
    private static final Logger log = LogManager.getLogger(ThreeSumClosestTests.class);

    @Test
    public void ThreeSumClosestTest1() {
        int[] array = {-1, 2, 1, -4};
        log.info(ThreeSumClosest.threeSumClosest(array, 2));
    }

    @Test
    public void ThreeSumClosestTest2() {
        int[] array = {-3,-2,-5,3,-4};
        log.info(ThreeSumClosest.threeSumClosest(array, 0));
    }

    @Test
    public void ThreeSumClosestTest3() {
        int[] array = {-3,-2,-5,3,-4};
        log.info(ThreeSumClosest.threeSumClosest(array, -1));
    }
}

