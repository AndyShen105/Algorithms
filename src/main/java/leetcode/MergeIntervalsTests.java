package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/28.
 */
public class MergeIntervalsTests {

    private static final Logger log = LogManager.getLogger(MergeIntervalsTests.class);

    @Test
    public void test1() {
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        log.info(mergeIntervals.merge(array));
    }

    @Test
    public void test2() {
        int[][] array = {{1, 4}, {4, 5}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        log.info(mergeIntervals.merge(array));
    }
}

