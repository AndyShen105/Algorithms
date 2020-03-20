package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/18.
 */
public class JumpGameTests {

    private static final Logger log = LogManager.getLogger(JumpGameTests.class);

    @Test
    public void jumpTest1() {
        int[] array = {2, 3, 1, 1, 4};
        log.info(JumpGame.canJump(array));
    }

    @Test
    public void jumpTest2() {
        int[] array = {1, 1, 1, 0};
        log.info(JumpGame.canJump(array));
    }

    @Test
    public void jumpTest3() {
        int[] array = {3, 2, 1, 0, 4};
        log.info(JumpGame.canJump(array));
    }

    @Test
    public void jumpTest4() {
        int[] array = {2, 3, 1, 1, 4};
        log.info(JumpGame.canJump(array));
    }

    @Test
    public void jumpTest5() {
        int[] array = {1, 2, 2, 6, 3, 6, 1, 8, 9, 4, 7, 6, 5, 6, 8, 2, 6, 1, 3, 6, 6, 6, 3, 2, 4, 9, 4, 5, 9, 8, 2, 2, 1, 6, 1, 6, 2, 2, 6, 1, 8, 6, 8, 3, 2, 8, 5, 8, 0, 1, 4, 8, 7, 9, 0, 3, 9, 4, 8, 0, 2, 2, 5, 5, 8, 6, 3, 1, 0, 2, 4, 9, 8, 4, 4, 2, 3, 2, 2, 5, 5, 9, 3, 2, 8, 5, 8, 9, 1, 6, 2, 5, 9, 9, 3, 9, 7, 6, 0, 7, 8, 7, 8, 8, 3, 5, 0};
        log.info(JumpGame.canJump(array));
    }
}

