package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/24.
 */
public class GasStation {

    private static final Logger log = LogManager.getLogger(GasStation.class);

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (helper(i, gas, cost)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean helper(int i, int[] gas, int[] cost) {
        int index, rest = 0, offset = 0;
        while (offset < gas.length) {
            index = (i + offset) % gas.length;
            rest += gas[index] - cost[index];
            if (rest < 0) {
                return false;
            }
            offset++;
        }
        return true;
    }
}

