package leetcode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/14.
 */
public class ZigZagConversionTests {

    private static final Logger log = LogManager.getLogger(ZigZagConversionTests.class);
    @Test
    public void zigZagConversionTest1() {
        String input = "PAYPALISHIRING";
        log.info(ZigZagConversion.convert(input, 3));
        assert ZigZagConversion.convert(input, 3).equals("PAHNAPLSIIGYIR");
    }

    @Test
    public void zigZagConversionTest2() {
        String input = "PAYPALISHIRING";
        log.info(ZigZagConversion.convert(input, 4));
        assert ZigZagConversion.convert(input, 4).equals("PINALSIGYAHRPI");
    }

    @Test
    public void zigZagConversionTest3() {
        String input = "AB";
        log.info(ZigZagConversion.convert(input, 1));

    }
}
