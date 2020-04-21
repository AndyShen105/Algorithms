package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */
public class BagProblem {

    private static final Logger log = LogManager.getLogger(BagProblem.class);

    public static int zoBag(int[] list, int val) {
        int[][] dp = new int[list.length][val];
        for (int i = 0; i < val; i++) {
            dp[0][i] = list[0];
        }
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < val; j++) {
            }
        }
        return 0;
    }
}

