package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/2.
 */
public class BestTimetoBuyandSellStockTests {

    private static final Logger log = LogManager.getLogger(BestTimetoBuyandSellStockTests.class);

    @Test
    public void BestTimetoBuyandSellStockTest1() {
        int[] array = {7, 1, 5, 3, 6, 4};
        assert BestTimetoBuyandSellStock.maxProfit(array) == 5;
    }

    @Test
    public void BestTimetoBuyandSellStockTest2() {
        int[] array = {7, 6, 5, 4};
        assert BestTimetoBuyandSellStock.maxProfit(array) == 0;
    }

    @Test
    public void BestTimetoBuyandSellStockTest3() {
        int[] array = {2, 4, 1};
        assert BestTimetoBuyandSellStock.maxProfit(array) == 2;
    }
}

