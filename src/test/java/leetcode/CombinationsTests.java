package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020/5/11.
 */
public class CombinationsTests {

    private static final Logger log = LogManager.getLogger(CombinationsTests.class);

    @Test
    public void test1() {
        int n = 4, k = 2;
        Combinations combinations = new Combinations();
        List<List<Integer>> list = combinations.combine(4, 2);
        log.info(list);

    }
}

