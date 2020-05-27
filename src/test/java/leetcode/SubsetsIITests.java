package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/27.
 */
public class SubsetsIITests {

    private static final Logger log = LogManager.getLogger(SubsetsIITests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 2};
        SubsetsII subsetsII = new SubsetsII();
        log.info(subsetsII.subsetsWithDup(array));
    }
}

