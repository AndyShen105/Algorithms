package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-05-06.
 */
public class LargestNumberTests {
    private static final Logger log = LogManager.getLogger(LargestNumberTests.class);

    @Test
    public void test1() {
        int[] array = {3, 30, 34, 5, 9};
        LargestNumber largestNumber = new LargestNumber();
        log.info(largestNumber.largestNumber(array));
    }

    @Test
    public void test2() {
        int[] array = {10, 2};
        LargestNumber largestNumber = new LargestNumber();
        log.info(largestNumber.largestNumber(array));
    }

    @Test
    public void test3() {
        int[] array = {1, 0};
        LargestNumber largestNumber = new LargestNumber();
        log.info(largestNumber.largestNumber(array));
    }
}
