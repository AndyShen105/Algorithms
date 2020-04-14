package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */
public class PerfectSquaresTests {

    private static final Logger log = LogManager.getLogger(PerfectSquaresTests.class);

    @Test
    public void perfectSquaresTest1() {
        int n = 12;
        log.info(PerfectSquares.numSquares(n));
        assert PerfectSquares.numSquares(n) == 3;
    }

    @Test
    public void perfectSquaresTest2() {
        int n = 13;
        log.info(PerfectSquares.numSquares(n));
        assert PerfectSquares.numSquares(n) == 2;
    }
}

