package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/6/2.
 */
public class UglyNumberTests {

    private static final Logger log = LogManager.getLogger(UglyNumberTests.class);

    @Test
    public void test1() {
        int i = 4;
        UglyNumber uglyNumber = new UglyNumber();
        assert uglyNumber.isUgly(i);
    }
}

