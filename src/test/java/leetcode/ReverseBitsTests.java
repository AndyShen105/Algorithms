package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-07.
 */
public class ReverseBitsTests {
    private static final Logger log = LogManager.getLogger(ReverseBitsTests.class);
    @Test
    public void test() {
        int i = 43261596;
        ReverseBits reverseBits = new ReverseBits();
        log.info(reverseBits.reverseBits(i));
    }

    @Test
    public void test2() {
        int i = 1;
        i = (i << 1)  ;
        log.info(i);
    }
}
