package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/3/20.
 */
public class JumpGame2Tests {

    private static final Logger log = LogManager.getLogger(JumpGame2Tests.class);

    @Test
    public void jumpTest1() {
        int[] array = {2, 3, 1, 1, 4};
        log.info(JumpGame2.jump(array));
    }

}

