package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-20.
 */
public class IntegerToRomanTests {
    private static final Logger log = LogManager.getLogger(IntegerToRomanTests.class);

    @Test
    public void IntegerToRomanTest1() {
        int val = 3;
        log.info(IntegerToRoman.intToRoman(val));

    }
    @Test
    public void IntegerToRomanTest2() {
        int val = 4;
        log.info(IntegerToRoman.intToRoman(val));
    }
}
