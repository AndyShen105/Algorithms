package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/15.
 */
public class UglyNumberIITests {

    private static final Logger log = LogManager.getLogger(UglyNumberIITests.class);

    @Test
    public void uglyNumberIITest1() {
        int n = 22;
        log.info(UglyNumberII.nthUglyNumber(n));
    }
}

