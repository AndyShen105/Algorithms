package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/3.
 */
public class MaximumProductSubarrayTests {

    private static final Logger log = LogManager.getLogger(MaximumProductSubarrayTests.class);

    @Test
    public void maximumProductSubarrayTest1() {
        int[] array = {2, 3, -2, 4};
        log.info(MaximumProductSubarray.maxProduct(array));
    }
}

