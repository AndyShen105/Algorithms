package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/9.
 */
public class RotateArrayTests {

    private static final Logger log = LogManager.getLogger(RotateArrayTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 2);
        log.info(array);
    }

    @Test
    public void test2() {
        int[] array = {-1, -100, 3, 99};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 2);
        log.info(array);
    }

    @Test
    public void test3() {
        int[] array = {-1, -100, 3, 99};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 2);
        log.info(array);
    }

}

