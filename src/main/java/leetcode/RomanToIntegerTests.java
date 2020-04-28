package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/28.
 */
public class RomanToIntegerTests {

    private static final Logger log = LogManager.getLogger(RomanToIntegerTests.class);

    @Test
    public void test1() {
        String str = "III";
        RomanToInteger romanToInteger = new RomanToInteger();
        log.info(romanToInteger.romanToInt(str));
    }

    @Test
    public void test2() {
        String str = "IX";
        RomanToInteger romanToInteger = new RomanToInteger();
        log.info(romanToInteger.romanToInt(str));
    }

    @Test
    public void test3() {
        String str = "LVIII";
        RomanToInteger romanToInteger = new RomanToInteger();
        log.info(romanToInteger.romanToInt(str));
    }

    @Test
    public void test4() {
        String str = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        log.info(romanToInteger.romanToInt(str));
    }
}

