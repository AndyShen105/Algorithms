package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/10.
 */
public class MaximalSquareTests {

    private static final Logger log = LogManager.getLogger(MaximalSquareTests.class);

    @Test
    public void maximalSquareTest1() {
        char[][] array = new char[4][5];
        char[] a1 = {'1', '0', '1', '0', '0'};
        char[] a2 = {'1', '0', '1', '1', '1'};
        char[] a3 = {'1', '1', '1', '1', '1'};
        char[] a4 = {'1', '0', '0', '1', '0'};
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;
        log.info(MaximalSquare.maximalSquare2DDP(array));
        assert MaximalSquare.maximalSquare2DDP(array) == 4;
    }
}

