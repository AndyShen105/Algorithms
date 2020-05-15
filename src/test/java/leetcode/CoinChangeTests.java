package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/5/14.
 */
public class CoinChangeTests {

    private static final Logger log = LogManager.getLogger(CoinChangeTests.class);

    @Test
    public void test1() {
        int[] array = {1, 2, 5};
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(array, 11);
    }

    @Test
    public void test2() {
        int[] array = {2};
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(array, 3);
    }
}

