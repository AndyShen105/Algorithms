package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/13.
 */
public class HouseRobber2Tests {

    private static final Logger log = LogManager.getLogger(HouseRobber2Tests.class);

    @Test
    public void HouseRobber2Test1() {
        int[] array = {1, 2, 3, 1};
        log.info(HouseRobber2.rob(array));
    }

    @Test
    public void HouseRobber2Test2() {
        int[] array = {2, 3, 2};
        log.info(HouseRobber2.rob(array));
    }
}

