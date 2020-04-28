package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/24.
 */
public class GasStationTests {

    private static final Logger log = LogManager.getLogger(GasStationTests.class);

    @Test
    public void test() {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        int i = GasStation.canCompleteCircuit(gas, cost);
        //boolean i = GasStation.helper(0, gas, cost);
        log.info(i);
        //assert i == 3;
    }
}

