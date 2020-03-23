package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/23.
 */
public class UniquePathsTests {

    private static final Logger log = LogManager.getLogger(UniquePathsTests.class);

    @Test
    public void UniquePathsTest1() {
        int m = 3, n = 2;
        assert UniquePaths.uniquePaths(m, n) == 3;
    }

    @Test
    public void UniquePathsTest2() {
        int m = 7, n = 3;
        assert UniquePaths.uniquePaths(m, n) == 28;
    }
}

