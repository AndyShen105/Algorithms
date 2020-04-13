package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/13.
 */
public class HouseRobberTests {

    private static final Logger log = LogManager.getLogger(HouseRobberTests.class);

    @Test
    public void houseRobberTest1() {
        int[] array = {1, 2, 3, 1};
        log.info(HouseRobber.rob2(array));
    }

    @Test
    public void houseRobberTest2() {
        int[] array = {2, 7, 9, 3, 1};
        log.info(HouseRobber.rob2(array));
    }
}

