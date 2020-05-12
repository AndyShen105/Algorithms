package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/12.
 */
public class NumberOfIslandsTests {

    private static final Logger log = LogManager.getLogger(NumberOfIslandsTests.class);

    @Test
    public void test1() {
        char[][] array = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        log.info(numberOfIslands.numIslands(array));
    }

    @Test
    public void test2() {
        char[][] array = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        log.info(numberOfIslands.numIslands(array));
    }
}

