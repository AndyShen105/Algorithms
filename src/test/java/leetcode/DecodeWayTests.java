package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/26.
 */
public class DecodeWayTests {

    private static final Logger log = LogManager.getLogger(DecodeWayTests.class);

    @Test
    public void decodeWaysTest1() {
        String s = "12";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 2;
    }

    @Test
    public void decodeWaysTest2() {
        String s = "226";
        assert DecodeWays.numDecodings(s) == 3;
    }

    @Test
    public void decodeWaysTest3() {
        String s = "0";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 0;
    }

    @Test
    public void decodeWaysTest4() {
        String s = "9";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 1;
    }

    @Test
    public void decodeWaysTest5() {
        String s = "10";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 1;
    }

    @Test
    public void decodeWaysTest6() {
        String s = "01";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 0;
    }

    @Test
    public void decodeWaysTest7() {
        String s = "01";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 0;
    }

    @Test
    public void decodeWaysTest8() {
        String s = "100";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 0;
    }

    @Test
    public void decodeWaysTest9() {
        String s = "101";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 1;
    }

    @Test
    public void decodeWaysTest10() {
        String s = "110";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 1;
    }

    @Test
    public void decodeWaysTest11() {
        String s = "227";
        log.info(DecodeWays.numDecodings(s));
        assert DecodeWays.numDecodings(s) == 2;
    }
}

