package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/7.
 */
public class UniqueBinarySearchTreesTests {

    private static final Logger log = LogManager.getLogger(UniqueBinarySearchTreesTests.class);

    @Test
    public void uniqueBinarySearchTreesTest1() {
        int n = 3;
        log.info(UniqueBinarySearchTrees.numTrees(3));
        assert UniqueBinarySearchTrees.numTrees(3) == 5;
    }

    @Test
    public void uniqueBinarySearchTreesTest2() {
        int n = 3;
        log.info(UniqueBinarySearchTreesII.generateTrees(4));
    }
}

