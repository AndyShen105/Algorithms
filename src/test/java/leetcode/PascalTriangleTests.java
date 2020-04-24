package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/2.
 */
public class PascalTriangleTests {

    private static final Logger log = LogManager.getLogger(PascalTriangleTests.class);

    @Test
    public void PascalTriangleTest1() {
        log.info(PascalTriangle.generate(5));
    }

    @Test
    public void PascalTriangleTest2() {
        log.info(PascalriangleII.generate(3));
    }
}

