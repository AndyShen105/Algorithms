package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020-04-23.
 */
public class PermutationsIITest {
    private static final Logger log = LogManager.getLogger(PermutationsIITest.class);

    @Test
    public void test() {
        int[] array = {1,1,2};
        PermutationsII test = new PermutationsII();
        log.info(test.permuteUnique(array));
    }
}
