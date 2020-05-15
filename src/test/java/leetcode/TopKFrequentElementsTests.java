package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/13.
 */
public class TopKFrequentElementsTests {

    private static final Logger log = LogManager.getLogger(TopKFrequentElementsTests.class);

    @Test
    public void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        topKFrequentElements.topKFrequent(nums, 2);
    }
}

