package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/22.
 */
public class CountAndSayTests {

    private static final Logger log = LogManager.getLogger(CountAndSayTests.class);

    @Test
    public void countAndSayTest1() {
        log.info(CountAndSay.countAndSay(1));
    }

    @Test
    public void countAndSayTest2() {
        log.info(CountAndSay.countAndSay(2));
    }

    @Test
    public void countAndSayTest3() {
        log.info(CountAndSay.countAndSay(3));
    }

    @Test
    public void countAndSayTest5() {
        log.info(CountAndSay.countAndSay(4));
    }

}

