package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class HappyNumberTests {
    private static final Logger log = LogManager.getLogger(HappyNumberTests.class);

    @Test
    public void test1() {
        int i = 19;
        HappyNumber happyNumber = new HappyNumber();
        log.info(happyNumber.isHappy(i));
    }
}
