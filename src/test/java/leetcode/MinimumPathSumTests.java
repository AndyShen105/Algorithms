package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/25.
 */
public class MinimumPathSumTests {

    private static final Logger log = LogManager.getLogger(MinimumPathSumTests.class);

    @Test
    public void MinimumPathSumTest1() {
        int[][] array = new int[3][3];
        int[] a1 = {1, 3, 1};
        int[] a2 = {1, 5, 1};
        int[] a3 = {4, 2, 1};
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        log.info(MinimumPathSum.minPathSum(array));
        assert MinimumPathSum.minPathSum(array) == 7;
    }
}

